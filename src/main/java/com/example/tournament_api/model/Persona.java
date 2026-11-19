package com.example.tournament_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Persona {

    @Column(nullable = false)
    private String name;

    public Persona(String name) {
        this.name = name;
    }
}