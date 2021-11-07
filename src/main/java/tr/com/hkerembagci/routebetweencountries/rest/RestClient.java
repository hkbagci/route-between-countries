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

import java.util.*;

@Component
@Data
public class RestClient {

    private static final String URL_COUNTRIES_JSON = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";
    private static List<Root> countryList;
    private static int routeCountryCount = 0;

    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper();
        String result = restTemplate.getForObject(URL_COUNTRIES_JSON, String.class);
        List<Root> countryList = objectMapper.readValue(result, new TypeReference<List<Root>>() {
        });
        for (Root country : countryList) {
            System.out.print(country.getName().getCommon()
                    + " - " + country.getCca3() + ", Borders: ");
            country.getBorders().forEach(c -> System.out.print(c + " "));
            System.out.println();
        }
    }

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
        Root sourceCountry = getCountryByCca3(source, countryList);
        if (null == sourceCountry) {
            throw new CountryNotFoundException("Source country cannot found: " + source);
        }
        List<String> result = findBestRoute(sourceCountry, destination);
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

    private List<String> findBestRoute(Root source, String destination) {
        List<List<String>> routeLists = new ArrayList<>();
        List<String> tempRouteList = createRouteList(source, destination, new ArrayList<>());
        routeLists.add(tempRouteList);
        int minimum = 0;
        List<String> bestRoute = new ArrayList<>();
        for (List<String> routeList : routeLists) {
            if (minimum == 0 || routeList.size() < minimum) {
                minimum = routeList.size();
                bestRoute = routeList;
            }
        }
        return bestRoute;
    }

    private List<String> createRouteList(Root source, String destination, List<String> routeMapList) {
        routeMapList.add(source.getCca3());
        if (null != source.getBorders()) {
            for (String border : source.getBorders()) {
                routeMapList.add(border);
                if (border.equals(destination)) {
                    return routeMapList;
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
