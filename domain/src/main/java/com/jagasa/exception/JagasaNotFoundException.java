package com.jagasa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Test exception")
public class JagasaNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public JagasaNotFoundException() {
        super();
    }

}
