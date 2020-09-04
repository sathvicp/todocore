package org.oretachino.todocore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.oretachino.todocore.repos")
@EntityScan(basePackages = "org.oretachino.todocore.entity")
@SpringBootApplication
public class TodocoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodocoreApplication.class, args);
	}

}
