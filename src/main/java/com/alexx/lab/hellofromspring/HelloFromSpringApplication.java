package com.alexx.lab.hellofromspring;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info= @Info(title = "HELLO FROM SPRING", version = "3.0.1", description = "Lab Test"),
		servers = {
				@Server(url = "http://localhost:8080")
		}
)
public class HelloFromSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloFromSpringApplication.class, args);
	}

}
