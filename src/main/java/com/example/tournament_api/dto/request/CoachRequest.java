package com.example.tournament_api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
public class CoachRequest {
    @NotBlank(message = "nombre no puede ser nulo")
    private String name;

    @Max(50)
    @Min(1)
    @NonNull
    private int yearExperience;

    @NonNull
    @Past
    private LocalDate birthdate;

    @Min(18)
    private int age;

}
