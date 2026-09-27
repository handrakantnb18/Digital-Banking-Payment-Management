package com.digitalbank.AuthService.security;

import com.digitalbank.AuthService.exception.InvalidCredentialsException;
import com.digitalbank.AuthService.exception.UserAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<Map<String, Object>> handleUserAlreadyExists(
            UserAlreadyExistsException ex) {

        return buildResponse(
                HttpStatus.CONFLICT,
                ex.getMessage()
        );
    }

    @ExceptionHandler({
            InvalidCredentialsException.class,
            BadCredentialsException.class
    })

    public ResponseEntity<Map<String, Object>> handleInvalidCredentials(Exception ex){
        return  buildResponse(
                HttpStatus.UNAUTHORIZED,
                "Invalid username or password"
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationErrors(
            MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(), error.getDefaultMessage());
        }

        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", HttpStatus.BAD_REQUEST.value());
        body.put("error", "Validation faied");
        body.put("Messagae", errors);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(body);
    }

    @ExceptionHandler(Exception.class)
    public  ResponseEntity<Map<String, Object>> handleGeneralException(
            Exception ex ){

        return buildResponse(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "An unexpected error occurred"
        );
    }

    private ResponseEntity<Map<String, Object>> buildResponse(
            HttpStatus status,
            String message ) {

                Map<String, Object> body = new HashMap<>();

                body.put("timestamp", LocalDateTime.now());
                body.put("status", status.value());
                body.put("error", status.getReasonPhrase());
                body.put("message", message);

                return ResponseEntity
                        .status(status)
                        .body(body);
            }
}
