package com.example.tournament_api.model;

import lombok.Data;

@Data
public class Coach extends Persona{
    private int experienceYears;

    public Coach(String name,int experienceYears) {
        super(name);
        this.experienceYears = experienceYears;
    }
}
