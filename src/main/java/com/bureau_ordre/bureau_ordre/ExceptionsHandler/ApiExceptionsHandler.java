package com.bureau_ordre.bureau_ordre.ExceptionsHandler;

import com.bureau_ordre.bureau_ordre.Beans.ApiException;
import com.bureau_ordre.bureau_ordre.Exceptions.EmailOrTelAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;

@ControllerAdvice
public class ApiExceptionsHandler {

    @ExceptionHandler(value = {EmailOrTelAlreadyExistException.class})
    public ResponseEntity<?> emailAlreadyExistHandler(EmailOrTelAlreadyExistException e){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        ApiException apiException = new ApiException(e.getMessage(), httpStatus, new Timestamp(System.currentTimeMillis()));
        return  new ResponseEntity<>(apiException,httpStatus);
    }


}
