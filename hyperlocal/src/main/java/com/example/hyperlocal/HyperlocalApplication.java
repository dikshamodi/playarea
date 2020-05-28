package com.example.hyperlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HyperlocalApplication implements AsyncConfigurer{
	public static void main(String[] args) {
		SpringApplication.run(HyperlocalApplication.class, args);
	}

}
