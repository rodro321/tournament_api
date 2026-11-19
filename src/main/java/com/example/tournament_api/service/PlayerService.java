package com.example.tournament_api.service;

import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.request.TeamRequest;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.model.Player;
import com.example.tournament_api.model.Team;
import com.example.tournament_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@Service
public class PlayerService {
    //private final Map<Long, PlayerResponse> players = new LinkedHashMap<>();
    @Autowired
    PlayerRepository playerRepository;


    public Player save(PlayerRequest playerRequest) {
        Player player = new Player(playerRequest.getName(),playerRequest.getNumber());
        return playerRepository.save(player);
    }

    public List<Player> findAll() {
        return playerRepository.findAll();
    }
    public Optional<Player> getById(Long id) {
        return playerRepository.findById(id);
    }


    /*
    public PlayerService (){
        playerRepository = new PlayerRepository();
        idPlayer = 0L;
    }

    public  PlayerResponse save(PlayerRequest playerRequest) {
        validate(playerRequest);
        idPlayer++;
        return playerRepository.save(idPlayer,playerRequest.getName(), playerRequest.getNumber());

    }

    public  List<PlayerResponse> findAll() {
        return playerRepository.findAll();

    }

    public  PlayerResponse update(Long id, PlayerRequest playerRequest){
        validate(playerRequest);
        return playerRepository.update(id,playerRequest);
    }

    public  void delete(Long id){
        playerRepository.delete(id);
    }


    private void validate(PlayerRequest playerRequest) {
        playerRepository.validate(playerRequest);
    }

     */
}
