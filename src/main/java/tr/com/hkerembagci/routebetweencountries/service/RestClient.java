package tr.com.hkerembagci.routebetweencountries.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tr.com.hkerembagci.routebetweencountries.entity.Root;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;
import tr.com.hkerembagci.routebetweencountries.model.Node;

import java.io.IOException;
import java.util.*;

@Component
@Data
public class RestClient {

    // If you can access the json file over Internet, you can use as below.
    private static final String URL_COUNTRIES_JSON = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";
    // If you don't have access the json file or encounter SSL certification error you can use as below
    // Or you have to add the certificate of the website contains json file to java keystore/cacerts file in your JRE
//    @Value("classpath:countries.json")
//    private Resource resourceFile;
    private static List<Root> countryList;
    private static int minimumRoute = 0;
    private static Root sourceCountry;
    private static Root nextCountry;
    private static Root destinationCountry;
    private static List<String> bestRouteList;
    private static Set<String> tracedCountryList;
    private static Node sourceCountryNode;

    public void getCountryList() throws IOException {
        // If you can access the json file over Internet, you can use this.
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResult = restTemplate.getForObject(URL_COUNTRIES_JSON, String.class);
        countryList = objectMapper.readValue(jsonResult, new TypeReference<List<Root>>() { });

        /* If you don't have access the json file or encounter SSL certification error you can use as below
        ObjectMapper objectMapper = new ObjectMapper();
        countryList = Arrays.asList(objectMapper.readValue(resourceFile.getFile(), Root[].class));
         */
    }

    private void initVariables(String source, String destination) throws CountryNotFoundException, IOException {
        if (null == countryList) {
            getCountryList();
        }
        sourceCountry = getCountryByCca3(source);
        if (null == sourceCountry) {
            throw new CountryNotFoundException("Source country cannot found: " + source);
        }
        destinationCountry = getCountryByCca3(destination);
        if (null == destinationCountry) {
            throw new CountryNotFoundException("Destination country cannot found: " + destination);
        }
        tracedCountryList = new HashSet<>();
    }

    public String findRouteByCountries(String source, String destination) throws CountryNotFoundException, IOException {
        initVariables(source, destination);
        initNodes();
        List<String> resultList = findBestRoute();
        if (resultList.isEmpty()) {
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();
        ArrayNode arrayNode = rootNode.putArray("route");
        for (String item : resultList) {
            arrayNode.add(item);
        }
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
    }

    private void initNodes() {
        sourceCountryNode = new Node();
        sourceCountryNode.setNode(sourceCountry);
        sourceCountryNode.setNextNodeList(getBordersAsRoot(sourceCountryNode.getNode()));
    }

    private List<Root> getBordersAsRoot(Root root) {
        List<Root> tempRootList = new ArrayList<>();
        for (String s : root.getBorders()) {
            tempRootList.add(getCountryByCca3(s));
        }
        return tempRootList;
    }

    private List<String> findBestRoute() {
        initNodes();
        List<Node> nodeList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        Node currentCountryNode = sourceCountryNode;
        int level = 0;
        // Adding all countries and its' borders to nodeList recursively and traversing on the list with level variable
        while (!currentCountryNode.isDestination()) {
            tracedCountryList.add(currentCountryNode.getNode().getCca3());
            for (Root next : currentCountryNode.getNextNodeList()) {
                Node tempNode = new Node();
                tempNode.setNode(next);
                tempNode.setNextNodeList(getBordersAsRoot(next));
                tempNode.setPreviousNode(currentCountryNode.getNode());
                if (tempNode.getNode().getCca3().equals(destinationCountry.getCca3())) {
                    tempNode.setDestination(true);
                }
                if (!tracedCountryList.contains(tempNode.getNode().getCca3())) {
                    nodeList.add(tempNode);
                }
            }
            if (level < nodeList.size()) {
                currentCountryNode = nodeList.get(level);
                level++;
            } else {
                break;
            }
        }
        // Finding destinationNode in nodeList
        Node destinationNode = findDestinationNodeInList(nodeList);
        // Adding destination node and other countries until encounters sourceCountry to resultList
        if (null != destinationNode) {
            resultList.add(destinationNode.getNode().getCca3());
            findPreviousNode(destinationNode, resultList, nodeList);
            reverseList(resultList);
        }
        return resultList;
    }

    // Finding previous node recursively until encounters sourceCountry
    private Node findPreviousNode(Node node, List<String> resultList, List<Node> sameLevel) {
        if (null != node.getPreviousNode()) {
            resultList.add(node.getPreviousNode().getCca3());
            for (Node tempNode : sameLevel) {
                if (tempNode.getNode().equals(node.getPreviousNode())) {
                    findPreviousNode(tempNode, resultList, sameLevel);
                    break;
                }
            }
        }
        return null;
    }

    private void reverseList(List<String> resultList) {
        Collections.reverse(resultList);
    }

    private Node findDestinationNodeInList(List<Node> nodeList) {
        Optional<Node> tempNode = nodeList.stream().
                filter(Node::isDestination).
                findFirst();
        return tempNode.orElse(null);
    }

    // Finding the country from the list by country cca3 value
    public Root getCountryByCca3(String country) {
        for (Root root : countryList) {
            if (root.getCca3().equals(country)) {
                return root;
            }
        }
        return null;
    }

}