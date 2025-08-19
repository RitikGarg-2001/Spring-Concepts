package com.cornScheduling.cornScheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CornSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CornSchedulingApplication.class, args);
	}

}
