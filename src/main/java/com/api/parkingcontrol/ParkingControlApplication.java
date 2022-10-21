package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //Classe
@RestController
public class ParkingControlApplication { //Roda a Aplicação

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args); 
	}

	

}
