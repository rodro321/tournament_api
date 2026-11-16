package com.example.tournament_api.controller;

import com.example.tournament_api.dto.request.TeamRequest;
import com.example.tournament_api.model.Team;
import com.example.tournament_api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping()
    public void createPlayer(@RequestBody TeamRequest teamRequest){
        teamService.save(teamRequest);
    }

    @GetMapping("/teams")
    public List<Team> teamList(){
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Team getById(@PathVariable Long id){
        return teamService.getById(id);
    }

    @PutMapping("/{id}")
    public Team update(@PathVariable Long id, @RequestBody TeamRequest teamRequest){
        return teamService.update(id,teamRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        teamService.delete(id);
    }
}
