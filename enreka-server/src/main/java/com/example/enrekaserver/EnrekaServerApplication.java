package com.example.enrekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EnrekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnrekaServerApplication.class, args);
	}
}
