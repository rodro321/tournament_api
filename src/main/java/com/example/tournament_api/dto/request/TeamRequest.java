package com.example.tournament_api.dto.request;

import com.example.tournament_api.model.Coach;
import com.example.tournament_api.model.Player;
import lombok.Data;

@Data
public class TeamRequest {
    private String name;
    private String description;
    private String color;
}
