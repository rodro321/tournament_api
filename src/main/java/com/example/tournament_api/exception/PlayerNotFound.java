package com.example.tournament_api.exception;

public class PlayerNotFound extends RuntimeException{
    public PlayerNotFound (long id){
        super("Player not found: " + id);
    }
}
