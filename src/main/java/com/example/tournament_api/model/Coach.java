package com.example.tournament_api.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Coach")
@NoArgsConstructor
public class Coach extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int yearExperience;

    @Column(nullable = false)
    private LocalDate birthdate;

    @Column(nullable = false)
    private int age;

    public Coach(String name,int yearExperience, LocalDate birthdate, int age) {
        super(name);
        this.yearExperience = yearExperience;
        this.birthdate = birthdate;
        this.age = age;

    }
}
