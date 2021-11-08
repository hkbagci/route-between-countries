package tr.com.hkerembagci.routebetweencountries.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import tr.com.hkerembagci.routebetweencountries.entity.Root;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;
import tr.com.hkerembagci.routebetweencountries.model.Node;

import java.io.IOException;
import java.util.*;

@Component
@Data
public class RestClient {

    //    If you can access the json file over Internet, you can use as below.
    //    private static final String URL_COUNTRIES_JSON = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";
    @Value("classpath:countries.json")
    private Resource resourceFile;
    private static List<Root> countryList;
    private static int minimumRoute = 0;
    private static Root sourceCountry;
    private static Root nextCountry;
    private static Root destinationCountry;
    private static List<String> bestRouteList;
    private static Set<String> tracedCountryList;

    public void getCountryList() throws IOException {
        /*
            If you can access the json file over Internet, you can use this.
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonResult = restTemplate.getForObject(URL_COUNTRIES_JSON, String.class);
            countryList = objectMapper.readValue(jsonResult, new TypeReference<List<Root>>() {});
         */

        ObjectMapper objectMapper = new ObjectMapper();
        countryList = Arrays.asList(objectMapper.readValue(resourceFile.getFile(), Root[].class));
    }

    public String findRouteByCountries(String source, String destination) throws CountryNotFoundException, IOException {
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
        List<String> result = findBestRoute();
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode rootNode = mapper.createObjectNode();

        ObjectNode childNode = mapper.createObjectNode();
        for (String r : result) {
            childNode.put(r, r);
        }
        rootNode.set("route", childNode);

        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
        System.out.println(jsonString);

        return jsonString;
    }

    private List<String> findBestRoute() {
        List<Node> nodeList = new ArrayList<>();
        Node node = new Node();
        node.setRoot(sourceCountry);
        node.setBorders(sourceCountry.getBorders());
        node.setRouteNumber(new ArrayList<>(1));
        nodeList.add(node);
        Root source = sourceCountry;
        int i = 1;
        int k = 1;
        boolean found = false;
        while (!source.getBorders().contains(destinationCountry.getCca3())) {
            tracedCountryList.add(source.getCca3());
            for (int j = 1; j <= source.getBorders().size(); j++) {
                if (!tracedCountryList.contains(source.getBorders().get(j - 1))) {
                    node = new Node();
                    node.setRoot(getCountryByCca3(source.getBorders().get(j - 1)));
                    node.setBorders(node.getRoot().getBorders());
                    node.setRouteNumber(Arrays.asList(i, j));
                    nodeList.add(node);
                    if (node.getRoot().getBorders().contains(destinationCountry.getCca3())) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                break;
            }
            i++;
            for (; k <= source.getBorders().size(); k++) {
                if (!tracedCountryList.contains(source.getBorders().get(k - 1))) {
                    source = getCountryByCca3(source.getBorders().get(k - 1));
                }
                break;
            }
            if (i > sourceCountry.getBorders().size()) {
                break;
            }
        }
        List<String> resultList = new ArrayList<>();
        resultList.add(destinationCountry.getCca3());
        reverseRoute(nodeList.get(nodeList.size() - 1).getRoot(), resultList);
        int z = 1;
        for (int r = 0; r < nodeList.size() - 1; r++) {
            if (nodeList.get(r).getBorders().contains(resultList.get(z))) {
                z++;
                reverseRoute(nodeList.get(r).getRoot(), resultList);
                if (r == 0) {
                    break;
                } else {
                    r = r-2;
                }
            }
        }
        Collections.reverse(resultList);
        return resultList;
    }

    private void reverseRoute(Root lastNode, List<String> resultList) {
        resultList.add(lastNode.getCca3());
    }

    public Root getCountryByCca3(String country) {
        for (Root root : countryList) {
            if (root.getCca3().equals(country)) {
                return root;
            }
        }
        return null;
    }

}