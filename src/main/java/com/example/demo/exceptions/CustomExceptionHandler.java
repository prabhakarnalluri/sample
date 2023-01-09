package com.example.demo.exceptions;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler
    ResponseEntity<?>resourceNotFoundExceptionHandler(ResoureceNotFoundException ex){
        String message =ex.getMessage();
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

}
