package com.palina.cross;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CrossServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrossServerApplication.class, args);
	}

}
