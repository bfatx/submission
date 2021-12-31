package com.applications.heb.submission.exception;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        Map<String, Object> exceptionMap = new HashMap<>();
        exceptionMap.put("date", new Date());
        exceptionMap.put("message", ex.getMessage());
        exceptionMap.put("description", request.getDescription(false));
        return new ResponseEntity<>(exceptionMap, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
