package tr.com.hkerembagci.routebetweencountries.service;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.routebetweencountries.exception.CountryNotFoundException;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;

@Service
@AllArgsConstructor
@Log4j2
public class CountryService {

    private final CountryClientService countryClientService;

    public ResponseEntity<String> findRouteBetweenCountries(String source, String destination) {
        try {
            String result = countryClientService.findRouteByCountries(source, destination);
            if (null != result) {
                return ResponseEntity.ok(result);
            } else {
                return ResponseEntity.badRequest().body(null);
            }
        } catch (CountryNotFoundException | IOException e) {
            log.error(e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}