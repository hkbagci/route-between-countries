package tr.com.hkerembagci.routebetweencountries.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import tr.com.hkerembagci.routebetweencountries.entity.Root;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;
import tr.com.hkerembagci.routebetweencountries.model.Graph;
import tr.com.hkerembagci.routebetweencountries.model.Node;

import java.util.*;

@Component
@Data
public class RestClient {

    private static final String URL_COUNTRIES_JSON = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";
    private static List<Root> countryList;
    private static int minimumRoute = 0;
    private static Root sourceCountry;
    private static Root destinationCountry;

    public void getCountryList() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResult = restTemplate.getForObject(URL_COUNTRIES_JSON, String.class);
        countryList = objectMapper.readValue(jsonResult, new TypeReference<List<Root>>() {
        });
    }

    public String findRouteByCountries(String source, String destination) throws CountryNotFoundException, JsonProcessingException {
        if (null == countryList) {
            getCountryList();
        }
        sourceCountry = getCountryByCca3(source, countryList);
        if (null == sourceCountry) {
            throw new CountryNotFoundException("Source country cannot found: " + source);
        }
        destinationCountry = getCountryByCca3(destination, countryList);
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
        List<String> bestRoute = new ArrayList<>();
        for (String border : sourceCountry.getBorders()) {
            List<String> tempRouteList = createRouteList(sourceCountry, destinationCountry.getCca3(), new ArrayList<>());
            if (null != tempRouteList) {
                minimumRoute = tempRouteList.size();
                bestRoute = tempRouteList;
            }
        }
        return bestRoute;
    }

    private List<String> createRouteList(Root source, String destination, List<String> routeMapList) {
        if (null != source.getBorders()) {
            for (String border : source.getBorders()) {
                if (routeMapList.isEmpty()) {
                    routeMapList.add(sourceCountry.getCca3());
                } else {
                    if (routeMapList.contains(border)) {
                        continue;
                    } else {
                        routeMapList.add(border);
                    }
                }
                if (source.getBorders().contains(destinationCountry.getCca3())) {
                    routeMapList.add(destinationCountry.getCca3());
                    return routeMapList;
                }
                if (minimumRoute != 0 && minimumRoute < routeMapList.size()) {
                    return null;
                }
                createRouteList(getCountryByCca3(border, countryList), destination, routeMapList);
            }
        }
        return routeMapList;
    }

    public Root getCountryByCca3(String country, List<Root> countryList) {
        for (Root root : countryList) {
            if (root.getCca3().equals(country)) {
                return root;
            }
        }
        return null;
    }
}
