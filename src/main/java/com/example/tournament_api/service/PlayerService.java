package com.example.tournament_api.service;

import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.model.Player;
import com.example.tournament_api.repository.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayerService {
    private final Map<Long, PlayerResponse> players = new LinkedHashMap<>();
    private long idPlayer;
    PlayerRepository playerRepository;



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
}
