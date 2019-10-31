package com.myapp.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class StubRunnerBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(StubRunnerBootApplication.class, args);
	}
}