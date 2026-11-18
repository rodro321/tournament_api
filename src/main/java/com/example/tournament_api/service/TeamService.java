package com.example.tournament_api.service;

import com.example.tournament_api.dto.request.TeamRequest;
import com.example.tournament_api.model.Team;
import com.example.tournament_api.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    //public List<Team> teamList = new ArrayList<>();
    private Long idTeam;

    @Autowired
    private TeamRepository teamRepository;

    public TeamService() {
        this.idTeam = 0L;
    }

    public Team save(TeamRequest teamRequest) {
        Team team = new Team(teamRequest.getName());
        return teamRepository.save(team);
    }

    public List<Team> findAll() {
        //return teamRepository.findAll();
        return teamRepository.findAll();
    }
    public Optional<Team> getById(Long id) {
        return teamRepository.findById(id);
    }


    /*
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

        teamList.removeIf(team -> team.getId().equals(id));
    }
    */


}
