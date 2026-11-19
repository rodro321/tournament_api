package com.example.tournament_api.repository;

import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.model.Player;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

        List<Player> findAll();

    /*
    private final Map<Long, PlayerResponse> players = new LinkedHashMap<>();

    public  PlayerResponse save(Long id, String name, int number) {
        return addPlayer(id, name, number);
    }

    private PlayerResponse addPlayer(Long id, String name, int number){
        PlayerResponse player = new PlayerResponse(id,  name,  number);
        players.put(id,player);
        return player;
    }

    public List<PlayerResponse> findAll() {
        return new ArrayList<>(players.values());
    }

    public  PlayerResponse update(Long id, PlayerRequest playerRequest) {
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

    public void validate(PlayerRequest playerRequest) {
        if (playerRequest.getName() == null || playerRequest.getName().isBlank() || playerRequest.getNumber() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Se requieren el nombre y el numero");
        }
    }

     */

}
