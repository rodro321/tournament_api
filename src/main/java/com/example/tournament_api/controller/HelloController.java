package com.example.tournament_api.controller;

import com.example.tournament_api.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/a1")
    public String hello1() {
        return "Hola Spring Boot1";
    }
    @GetMapping
    public String hello() {
        return "Hola Spring Boot";
    }

    @GetMapping("/course")
    public String course() {
        return "Full Court Basketball";
    }

    @GetMapping("/players")
    public List<Player> listPlayer() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player( "Ricardo", 7));
        playerList.add(new Player( "Rolando", 8));
        playerList.add(new Player( "Pablo", 9));
        return playerList;
    }
    @GetMapping("/player")
    public Map<String, String> getPlayer() {
        return Map.of("name", "Leonardo");
    }

}
