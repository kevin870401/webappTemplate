package com.guk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BayconWebAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(BayconWebAppApplication.class, args);
	}
}
