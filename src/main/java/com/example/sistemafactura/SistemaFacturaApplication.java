package com.example.sistemafactura;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SistemaFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaFacturaApplication.class, args);
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			System.out.println("Hola Mundo");
		};
	}

}
