package tr.com.hkerembagci.routebetweencountries.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ResponseStatus(NOT_FOUND)
public class CountryNotFoundException extends Exception {

    public CountryNotFoundException() {
        super();
    }

    public CountryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CountryNotFoundException(String message) {
        super(message);
    }

    public CountryNotFoundException(Throwable cause) {
        super(cause);
    }
}
