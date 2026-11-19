package com.example.tournament_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Player")
@NoArgsConstructor
public class Player extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //private String name;
    @Column(nullable = false)
    private int number;
    @Column(nullable = false)
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
