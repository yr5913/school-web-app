package com.yugeshreganti.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EntityScan("com.yugeshreganti.school.model")
@EnableJpaRepositories("com.yugeshreganti.school.repository")
public class SchoolWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolWebAppApplication.class, args);
    }

}
