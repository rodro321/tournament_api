package com.example.tournament_api.controller;

import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/list")
    public List<PlayerResponse> playerList() {
        return playerService.findAll();
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public PlayerResponse create(@RequestBody PlayerRequest playerRequest) {
        return playerService.save(playerRequest);
    }

    @PutMapping("/{id}")
    public PlayerResponse update(@PathVariable Long id, @RequestBody PlayerRequest playerRequest) {
        return playerService.update(id, playerRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        playerService.delete(id);
    }
}
