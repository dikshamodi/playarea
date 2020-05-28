package com.example.cf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class CfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfApplication.class, args);
	}

}
