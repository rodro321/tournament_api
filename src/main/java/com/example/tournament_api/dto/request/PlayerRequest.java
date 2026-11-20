package com.example.tournament_api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

@Data
public class PlayerRequest {
    @NotBlank
    private String name;

    @Max(50)
    @Min(10)
    private Integer number;

}
