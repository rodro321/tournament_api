package com.example.tournament_api.model;

import lombok.Data;

@Data
public class Player extends Persona{
    //private String name;
    private int number;
    private int points;

    public Player(String name, int number) {
        super(name);
        this.number = number;
        this.points = 0;
    }

    //public Long getId() { return id; }
    /*public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getNumber() { return number; }
    public int getPoints() { return points; }*/



}
