package com.app.appforceup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootConfiguration
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories("com.app.forceup.repository")
@ComponentScan({"com.app.forceup.controller","com.app.forceup.service","com.app.forceup.service.BO"})
@EntityScan("com.app.forceup.model")  
public class ForceUpAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForceUpAppApplication.class, args);
		System.out.println("Hello");
	}
}
