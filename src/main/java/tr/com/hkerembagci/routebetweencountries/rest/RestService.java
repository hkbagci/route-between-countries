package tr.com.hkerembagci.routebetweencountries.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;

import java.io.IOException;

@RestController
@RequestMapping(path = "/routing")
public class RestService {

    private final RestClient restClient;

    public RestService(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping(value = "/{source}/{destination}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> findRouteBetweenCountries(@PathVariable String source, @PathVariable String destination) throws CountryNotFoundException, IOException {
        return ResponseEntity.ok(restClient.findRouteByCountries(source, destination));
    }

}
