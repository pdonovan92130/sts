package com.intuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ResttwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttwoApplication.class, args);
	}
}
