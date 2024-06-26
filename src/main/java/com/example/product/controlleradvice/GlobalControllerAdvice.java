package com.example.product.controlleradvice;


import com.example.product.dtos.ErrorResponseDto;
import com.example.product.exception.InvalidProductIdException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {


    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ErrorResponseDto> handleArithmaticException() {
        return new ResponseEntity<>(new ErrorResponseDto(), HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler(InvalidProductIdException.class)
    public ResponseEntity<ErrorResponseDto> handleInvlaidProduct() {
        return new ResponseEntity<>(new ErrorResponseDto(), HttpStatus.NOT_FOUND);
    }
}
