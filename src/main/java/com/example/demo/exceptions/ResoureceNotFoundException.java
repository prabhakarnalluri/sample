package com.example.demo.exceptions;

public class ResoureceNotFoundException extends RuntimeException{
        String resourceName;
        String fieldName;
        Long fieldValue;
        public ResoureceNotFoundException(String resourceName, String fieldName, Long fieldValue){
                        super(String.format("%s Not Found with %s : %s",resourceName,fieldName,fieldValue));
                this.resourceName=resourceName;
                this.fieldName=fieldName;
                this.fieldValue=fieldValue;
        }
}
