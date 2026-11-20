package com.example.tournament_api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandlerPlayer {

    @ExceptionHandler(PlayerNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse hanlderNotFound(PlayerNotFound ex){
        return  new ErrorResponse(ex.getMessage());
    }
}
