package com.alpha.toptotop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.alpha.toptotop"})
public class TopToTopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopToTopApplication.class, args);
	}

}
