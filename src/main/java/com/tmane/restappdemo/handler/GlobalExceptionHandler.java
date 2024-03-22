package com.tmane.restappdemo.handler;

import com.tmane.restappdemo.exeption.PersonnageNoSuchElementException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PersonnageNoSuchElementException.class)
    @ResponseBody
    public ResponseEntity<String> handlePersonnageNotFoundException(PersonnageNoSuchElementException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }
}
