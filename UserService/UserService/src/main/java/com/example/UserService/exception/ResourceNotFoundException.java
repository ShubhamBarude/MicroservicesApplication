package com.example.UserService.exception;

public class ResourceNotFoundException extends RuntimeException {

    //extra properties that you want to mange
    public ResourceNotFoundException() {
        super("Resource not found on server !!");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}
