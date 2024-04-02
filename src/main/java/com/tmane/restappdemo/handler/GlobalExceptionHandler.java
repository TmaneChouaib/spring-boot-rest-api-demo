package com.tmane.restappdemo.handler;

import com.tmane.restappdemo.exeption.PersonnageNoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {
    private MessageSource messageSource;

    @ExceptionHandler(PersonnageNoSuchElementException.class)
    @ResponseBody
    public ResponseEntity<String> handlePersonnageNotFoundException(PersonnageNoSuchElementException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<String> handleGenericException(Exception e) {
        String errorMessage = messageSource.getMessage("generic.error",null, LocaleContextHolder.getLocale());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
    }
}
