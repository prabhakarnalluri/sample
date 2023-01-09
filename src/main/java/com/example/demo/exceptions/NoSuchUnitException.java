package com.example.demo.exceptions;

public class NoSuchUnitException extends RuntimeException{
    public NoSuchUnitException(String message) {
        super(message);
    }
}
