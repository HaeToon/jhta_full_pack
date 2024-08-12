package com.heoth.study0806.advice;

import com.heoth.study0806.exception.AppException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e){
        e.printStackTrace();
        return "error/500";
    }

    @ExceptionHandler(AppException.class)
    public String handleAppException(AppException e){

        return "error/app";
    }
}
