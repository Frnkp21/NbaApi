package com.example.NbaApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NbaApiApplication {
	private static final Logger log = LoggerFactory.getLogger(NbaApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NbaApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder
				.defaultHeader("X-RapidAPI-Key","5396d6953cmsh3538206c8eefdcep111bf5jsn8ed4398d89e9")
				.build();
	}
}
