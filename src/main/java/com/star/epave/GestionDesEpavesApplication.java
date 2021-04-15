package com.star.epave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories (basePackages ="com.star.gestion_des_epaves.user.repos.UserRepository") 
//@EnableAutoConfiguration
public class GestionDesEpavesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDesEpavesApplication.class, args);
	}

}
