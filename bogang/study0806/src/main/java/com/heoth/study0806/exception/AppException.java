package com.heoth.study0806.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppException extends RuntimeException{


    public AppException(String message) {

    }
}
