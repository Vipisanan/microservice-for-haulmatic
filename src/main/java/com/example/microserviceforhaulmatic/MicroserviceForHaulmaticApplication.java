package com.example.microserviceforhaulmatic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class MicroserviceForHaulmaticApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceForHaulmaticApplication.class, args);
    }

}
