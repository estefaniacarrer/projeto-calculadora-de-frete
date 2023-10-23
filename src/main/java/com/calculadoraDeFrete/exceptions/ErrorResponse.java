package com.calculadoraDeFrete.exceptions;

import java.time.LocalDateTime;
import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorResponse {

    private Class<?> exceptionClass;
    private HttpStatus httpStatus;
    private String message;
    private LocalDateTime thrownAt;

    public <T> ErrorResponse(Class<?> exceptionClass, HttpStatus httpStatus, String message) {
        this.exceptionClass = exceptionClass;
        this.httpStatus = httpStatus;
        this.message = message;
        this.thrownAt = LocalDateTime.now();
    }
}