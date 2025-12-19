package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@RestControllerAdvice
public class globalexception{
@ExceptionHandler(validationexception.class)
public ResponseBody<String> handlevalidationexception(validationexception ex){
    return new ResponseBody<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

}
}
