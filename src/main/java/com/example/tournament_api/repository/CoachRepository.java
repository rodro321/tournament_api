package com.example.tournament_api.repository;

import com.example.tournament_api.model.Coach;
import com.example.tournament_api.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
    List<Coach> findAll();
}
