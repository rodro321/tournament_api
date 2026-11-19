package com.example.tournament_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
@Table(name = "Teams")
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public Team (String name){
        this.name = name;
    }
    public Team (){

    }

    /*
    private Coach coach;
    private int points ;
    private List<Player> listPlayer;

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPlayer(Player player1){
        listPlayer.add(player1);
    }*/
}
