package com.example.tournament_api.model;

import lombok.Data;

@Data
public class Persona {
    private String name;

    public Persona(String name){
        this.name = name;
    }
}