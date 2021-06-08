package com.project.bootcamp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ExceptionResponse> handlerSecurity(BusinessException ex){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse((ex.getMessage())));
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ExceptionResponse> handlerSecurity(NotFoundException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse((ex.getMessage())));
    }
}
