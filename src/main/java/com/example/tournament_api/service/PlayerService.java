package com.example.tournament_api.service;

import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.PlayerResponse;
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
    private long idPlayer = 0L;


    public  PlayerResponse save(PlayerRequest playerRequest) {
        validate(playerRequest);
        return addPlayer(playerRequest.getName(), playerRequest.getNumber());
    }

    public  List<PlayerResponse> findAll() {
        return new ArrayList<>(players.values());
    }

    public  PlayerResponse update(Long id, PlayerRequest playerRequest) {
        validate(playerRequest);
        if (!players.containsKey(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El jugador no existe");
        }

        PlayerResponse player = new PlayerResponse(id, playerRequest.getName(), playerRequest.getNumber());
        players.put(id, player);
        return player;
    }

    public  void delete(Long id) {
        if (players.remove(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El jugador no existe");
        }
    }

    private PlayerResponse addPlayer(String name, int number) {
        idPlayer++;
        PlayerResponse player = new PlayerResponse(idPlayer, name, number);
        players.put(idPlayer, player);
        return player;
    }

    private void validate(PlayerRequest playerRequest) {
        if (playerRequest.getName() == null || playerRequest.getName().isBlank() || playerRequest.getNumber() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Se requieren el nombre y el numero");
        }
    }
}
