package com.yugeshreganti.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SchoolWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolWebAppApplication.class, args);
	}

}
