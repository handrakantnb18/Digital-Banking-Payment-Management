package com.digitalbank.AuthService.exception;

public class GlobalExceptionHandler extends RuntimeException {
    public GlobalExceptionHandler(String msg){
        super(msg);
    }

}
