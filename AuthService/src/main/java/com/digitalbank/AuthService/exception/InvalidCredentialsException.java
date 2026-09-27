package com.digitalbank.AuthService.exception;

public class InvalidCredentialsException  extends RuntimeException {
    public InvalidCredentialsException(String msg){
        super(msg);
    }
}
