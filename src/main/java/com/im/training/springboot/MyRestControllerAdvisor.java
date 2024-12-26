package com.im.training.springboot;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyRestControllerAdvisor {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionMessage> exceptionHandler(Exception exception, HttpServletRequest request) {

        System.out.println("handling exception");

        ExceptionMessage exceptionMessage = new ExceptionMessage();

        exceptionMessage.setMessage(exception.getMessage());
        exceptionMessage.setDetails(exception.getMessage());
        exceptionMessage.setStatus(HttpStatus.BAD_REQUEST.value());
        exceptionMessage.setPath(request.getRequestURI());



        return new ResponseEntity<>(exceptionMessage, HttpStatus.BAD_REQUEST);


    }
}


