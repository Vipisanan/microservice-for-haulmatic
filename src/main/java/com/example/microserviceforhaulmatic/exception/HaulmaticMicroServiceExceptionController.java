package com.example.microserviceforhaulmatic.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
//The @ControllerAdvice is an annotation, to handle the exceptions globally.
public class HaulmaticMicroServiceExceptionController {

    @ExceptionHandler(value = ProductNotFoundException.class)
    public ResponseEntity<Object> exception(ProductNotFoundException exception) {
        return new ResponseEntity<>("Product not found" , HttpStatus.NOT_FOUND);
    }


}
