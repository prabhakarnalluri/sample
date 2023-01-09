package com.example.demo.exceptions;

public class EmptyDataException  extends RuntimeException{
    private String message;

    public EmptyDataException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
