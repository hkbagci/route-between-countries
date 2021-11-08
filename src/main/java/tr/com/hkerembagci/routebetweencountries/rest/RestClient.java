package tr.com.hkerembagci.routebetweencountries.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import tr.com.hkerembagci.routebetweencountries.entity.Root;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;

import java.io.IOException;
import java.util.*;

@Component
@Data
public class RestClient {

    //    If you can access the json file over Internet, you can use as below.
    //    private static final String URL_COUNTRIES_JSON = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";
    private static final String URL_COUNTRIES_JSON = "D:\\HKB\\route-between-countries-master\\countries.json";
    @Value("classpath:countries.json")
    private Resource resourceFile;
    private static List<Root> countryList;
    private static int minimumRoute = 0;
    private static Root sourceCountry;
    private static Root destinationCountry;
    private static List<String> bestRouteList;

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
        bestRouteList = new ArrayList<>();
        Set<Map<String, List<String>>> routeSet = new HashSet<>();
        createRouteList(sourceCountry, routeSet);
        return bestRouteList;
    }

    private void createRouteList(Root source, Set<Map<String, List<String>>> routeSet) {
        bestRouteList.add(source.getCca3());
        routeSet.add(getNodeList(source));
        for (Map<String, List<String>> set : routeSet) {
            for (Map.Entry<String, List<String>> entry : set.entrySet()) {
                if (entry.getValue().contains(destinationCountry.getCca3())) {
                    bestRouteList.add(destinationCountry.getCca3());
                    return;
                }
                for (String borderCountry : entry.getValue()) {
                    if (!bestRouteList.contains(borderCountry)) {
                        bestRouteList.add(source.getCca3());
                    }
                    Root tempSource = getCountryByCca3(borderCountry);
                    createRouteList(tempSource, routeSet);
                    return;
                }
            }
        }
    }

    private Map<String, List<String>> getNodeList(Root source) {
        Map<String, List<String>> tempMap = new HashMap<>();
        tempMap.put(source.getCca3(), source.getBorders());
        return tempMap;
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