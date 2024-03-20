package com.animz.ragapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class RagappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagappApplication.class, args);
	}

}
