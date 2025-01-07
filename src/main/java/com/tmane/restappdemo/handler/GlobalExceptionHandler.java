package com.tmane.restappdemo.handler;

import com.tmane.restappdemo.dto.ErrorResponse;
import com.tmane.restappdemo.exeption.CharacterNoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {
    private MessageSource messageSource;

    @ExceptionHandler(CharacterNoSuchElementException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handlePersonnageNotFoundException(CharacterNoSuchElementException e) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> handleGenericException(Exception e) {
        String errorMessage = messageSource.getMessage("generic.error",null, LocaleContextHolder.getLocale());
        ErrorResponse errorResponse= new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}
