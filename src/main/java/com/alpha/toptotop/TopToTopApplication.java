package com.alpha.toptotop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.alpha.toptotop"})
public class TopToTopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopToTopApplication.class, args);
	}

}
