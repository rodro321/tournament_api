package com.example.tournament_api.service;


import com.example.tournament_api.dto.request.CoachRequest;
import com.example.tournament_api.dto.request.PlayerRequest;
import com.example.tournament_api.dto.response.CoachResponse;
import com.example.tournament_api.dto.response.PlayerResponse;
import com.example.tournament_api.model.Coach;
import com.example.tournament_api.model.Player;
import com.example.tournament_api.repository.CoachRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class CoachService {

    @Autowired
    CoachRepository coachRepository;

    public List<Coach> findAll (){

        return coachRepository.findAll();
    }


    public CoachResponse findById(Long id){
        Coach coach = coachRepository.findById(id).orElseThrow(()-> new RuntimeException("not found: "+ id));
        return toResponse(coach);
    }



    public CoachResponse save (CoachRequest coachRequest){
        Coach coach = new Coach(coachRequest.getName(), coachRequest.getYearExperience(),coachRequest.getBirthdate(), coachRequest.getAge());
        Coach saveCoach = coachRepository.save(coach);
        return toResponse(saveCoach);
    }


    private CoachResponse toResponse(Coach saveCoach) {
        return  new CoachResponse(saveCoach.getName(), saveCoach.getYearExperience(), saveCoach.getBirthdate(), saveCoach.getAge());
    }


    public CoachResponse updateCoach(Long id, CoachRequest coachRequest){
        Coach coach = coachRepository.findById(id).orElseThrow(()-> new RuntimeException("not found: "+ id));
        coach.setName(coachRequest.getName());
        coach.setYearExperience(coachRequest.getYearExperience());
        coach.setBirthdate(coachRequest.getBirthdate());
        coach.setAge(coachRequest.getAge());

        Coach update = coachRepository.save(coach);
        return toResponse(update);
    }

    public void delete(Long id) {
        if (!coachRepository.existsById(id)) {
            throw new RuntimeException("no hay ");
        }
        coachRepository.deleteById(id);
    }


}
