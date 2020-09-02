package com.bureau_ordre.bureau_ordre.Beans;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public class ApiException {

    final private String message;
    final private HttpStatus httpStatus;
    final private Timestamp timestamp;

    public ApiException(String message, HttpStatus httpStatus, Timestamp timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
