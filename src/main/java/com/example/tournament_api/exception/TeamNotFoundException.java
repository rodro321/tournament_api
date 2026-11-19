package com.example.tournament_api.exception;

public class TeamNotFoundException extends RuntimeException{
    public TeamNotFoundException(Long id){
        super("Team not found" + id);
    }
}
