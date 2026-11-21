package com.example.tournament_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class TournamentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournamentApiApplication.class, args);
	}

}
