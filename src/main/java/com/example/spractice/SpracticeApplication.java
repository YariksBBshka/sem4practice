package com.example.spractice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.spractice.repositories")
public class SpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpracticeApplication.class, args);

    }
}