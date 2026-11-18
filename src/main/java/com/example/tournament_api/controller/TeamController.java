package com.example.tournament_api.controller;

import com.example.tournament_api.dto.request.TeamRequest;
import com.example.tournament_api.model.Team;
import com.example.tournament_api.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @PostMapping()
    public Team createPlayer(@RequestBody TeamRequest teamRequest){
        return teamService.save(teamRequest);
    }

    @GetMapping("/teams")
    public List<Team> teamList(){
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Team> getById(@PathVariable Long id){
        return teamService.getById(id);
    }

    /*
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
    */

}
