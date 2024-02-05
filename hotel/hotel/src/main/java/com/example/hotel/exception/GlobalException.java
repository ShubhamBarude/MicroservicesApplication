package com.example.hotel.exception;

import com.example.hotel.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
   @ExceptionHandler(ResourseNotFound.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourseNotFound ex){
        String message=ex.getMessage();
        ApiResponse response=ApiResponse.builder().Message(message).success(true).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);


    }
}
