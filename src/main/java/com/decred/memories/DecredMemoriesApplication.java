package com.decred.memories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DecredMemoriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecredMemoriesApplication.class, args);
	}
}
