package com.example.demoadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class DemoAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAdminServerApplication.class, args);
	}
}
