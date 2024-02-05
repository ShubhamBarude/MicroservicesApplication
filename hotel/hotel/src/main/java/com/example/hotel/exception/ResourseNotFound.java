package com.example.hotel.exception;

public class ResourseNotFound extends RuntimeException{
    public ResourseNotFound(){
        super("Resource not found on this server:");
    }
    public ResourseNotFound(String message){
        super(message);

    }
}
