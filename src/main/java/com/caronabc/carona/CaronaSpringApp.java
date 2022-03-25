package com.caronabc.carona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com"})
public class CaronaSpringApp {

	public static void main(String[] args) {
		SpringApplication.run(CaronaSpringApp.class, args);
	}

}