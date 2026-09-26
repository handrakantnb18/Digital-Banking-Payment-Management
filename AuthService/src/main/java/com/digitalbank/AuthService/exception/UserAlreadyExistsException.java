package com.digitalbank.AuthService.exception;

public class UserAlreadyExistsException extends RuntimeException {

    UserAlreadyExistsException(String msg) {
        super(msg);
    }
}
