package com.proyectAlex.Challenge_Foro_Alura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.proyectAlex.Challenge_Foro_Alura"})
public class ChallengeForoAluraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeForoAluraApplication.class, args);
	}
}

