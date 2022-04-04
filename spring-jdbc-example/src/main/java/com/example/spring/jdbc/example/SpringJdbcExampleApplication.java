package com.example.spring.jdbc.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@OpenAPIDefinition(info = @Info(title = "Restful APIs for student"))
@SpringBootApplication
public class SpringJdbcExampleApplication{

	public static void main(String[] args) {

		SpringApplication.run(SpringJdbcExampleApplication.class, args);
	}
}
