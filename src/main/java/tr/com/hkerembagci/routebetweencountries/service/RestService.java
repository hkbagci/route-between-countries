package tr.com.hkerembagci.routebetweencountries.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;

import java.io.IOException;

@RestController
@RequestMapping(path = "/routing")
public class RestService {

    private Logger logger = LoggerFactory.getLogger(RestService.class);

    private final RestClient restClient;

    public RestService(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping(value = "/{source}/{destination}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> findRouteBetweenCountries(@PathVariable String source, @PathVariable String destination) throws IOException {
        try {
            String result = restClient.findRouteByCountries(source, destination);
            if (null != result) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.badRequest().body(null);
            }
        } catch (CountryNotFoundException e) {
            logger.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
