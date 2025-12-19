package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

@RestControllerAdvice
public class globalexception{
@ExceptionHandler(validationexception.class)
public ResponseEntity<String> handlevalidationexception(validationexception ex){
    return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

}
}
