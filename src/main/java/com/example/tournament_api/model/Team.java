package com.example.tournament_api.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class Team {
    private Long id;
    private String name;
    private Coach coach;
    private int points ;
    private List<Player> listPlayer;

    public Team(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPlayer(Player player1){
        listPlayer.add(player1);
    }
}
