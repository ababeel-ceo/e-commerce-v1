package com.sabazaar.application;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@OpenAPIDefinition(info = @Info(title = "SA Bazaar Api's", version = "1.0", description = "E-Com by Sam & Abd"))
@ComponentScan(basePackages = {"com.sabazaar.*"})
@SpringBootApplication
public class SabazaarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SabazaarApplication.class, args);
	}

}
