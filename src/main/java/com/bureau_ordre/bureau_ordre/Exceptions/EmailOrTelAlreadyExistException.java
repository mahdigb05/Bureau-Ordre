package com.bureau_ordre.bureau_ordre.Exceptions;

public class EmailOrTelAlreadyExistException extends RuntimeException {
    public EmailOrTelAlreadyExistException(String message) {
        super(message);
    }
}
