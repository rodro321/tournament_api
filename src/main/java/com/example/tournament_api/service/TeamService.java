package com.example.tournament_api.service;

import com.example.tournament_api.dto.request.TeamRequest;
import com.example.tournament_api.model.Player;
import com.example.tournament_api.model.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    public List<Team> teamList = new ArrayList<>();
    private Long idTeam;

    public TeamService() {
        this.idTeam = 0L;
    }

    public void save(TeamRequest teamRequest) {
        idTeam++;
        Team team = new Team(idTeam, teamRequest.getName());
        teamList.add(team);
    }

    public List<Team> findAll() {
        return teamList;
    }

    public Team getById(Long id) {
        return teamList.stream().
                filter(team -> team.getId().equals(id)).
                findFirst().orElse(null);
    }
    public Team update(Long id, TeamRequest teamRequest) {
        Team teamResponse = teamList.stream().
                filter(team -> team.getId().equals(id)).
                findFirst().orElse(null);
        teamResponse.setId(id);
        teamResponse.setName(teamRequest.getName());
        return teamResponse;
    }

    public void delete(Long id) {
       /* Team teamResponse = teamList.stream().
                filter(team -> team.getId().equals(id)).
                findFirst().orElse(null);*/
        //validacion sout

        //sout error
        teamList.removeIf(team -> team.getId().equals(id));
    }

}
