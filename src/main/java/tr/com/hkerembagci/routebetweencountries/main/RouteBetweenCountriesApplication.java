package tr.com.hkerembagci.routebetweencountries.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "tr.com.hkerembagci.routebetweencountries")
public class RouteBetweenCountriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RouteBetweenCountriesApplication.class, args);
    }

}
