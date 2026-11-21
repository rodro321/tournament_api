package com.example.tournament_api.controller;

import com.example.tournament_api.dto.request.CoachRequest;
import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.CoachResponse;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.model.Coach;
import com.example.tournament_api.model.Player;
import com.example.tournament_api.service.CoachService;
import com.example.tournament_api.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    private CoachService coachService;

    @PostMapping()
    public CoachResponse creatCoah(@Valid @RequestBody CoachRequest coachRequest){
        return coachService.save(coachRequest);
    }

    @GetMapping("/list")
    public List<Coach> coachList(){

        return coachService.findAll();
    }

    @GetMapping("/{id}")
    public CoachResponse getById(@PathVariable Long id){
        return coachService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void coachDelete(@PathVariable Long id){
        coachService.delete(id);
    }

    @PutMapping("/{id}")
    public CoachResponse udpateCoach(@PathVariable Long id, @Valid @RequestBody CoachRequest coachRequest){
        return coachService.updateCoach(id,coachRequest);

    }

}
