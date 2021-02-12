package com.houserent.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@EntityScan(basePackages = {"com.houserent.model"})
public class HouserentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouserentManagementApplication.class, args);
	}

}
