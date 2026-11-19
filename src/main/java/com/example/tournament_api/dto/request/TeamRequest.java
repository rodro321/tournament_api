package com.example.tournament_api.dto.request;

import com.example.tournament_api.model.Coach;
import com.example.tournament_api.model.Player;
import lombok.Data;
import lombok.NonNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class TeamRequest {
    @NotBlank
    private String name;

    @Min(0)
    @Max(40)
    private int enableCategory;

    @NonNull
    private String description;
    @NonNull
    private String color;
}
