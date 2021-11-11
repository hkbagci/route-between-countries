package tr.com.hkerembagci.routebetweencountries.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.hkerembagci.routebetweencountries.service.CountryService;

import java.io.IOException;

@RestController
@RequestMapping(path = "/routing")
@AllArgsConstructor
public class CountryRestController {

	private final CountryService countryService;

    @GetMapping(value = "/{source}/{destination}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> findRouteBetweenCountries(@PathVariable String source, @PathVariable String destination) {
		return countryService.findRouteBetweenCountries(source, destination);
    }

}