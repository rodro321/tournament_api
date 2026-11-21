package com.example.tournament_api.dto.response;

import java.time.LocalDate;

public record CoachResponse (String name, int yearExperience, LocalDate birthdate, int age ){
}
