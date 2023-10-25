package com.example.Tournament_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TournamentSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TournamentSchedulerApplication.class, args);
	}

}
