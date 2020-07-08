package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.demo.repository.MongoExampleRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = MongoExampleRepository.class)
@EnableOAuth2Sso
public class ClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicApplication.class, args);
	}

}
