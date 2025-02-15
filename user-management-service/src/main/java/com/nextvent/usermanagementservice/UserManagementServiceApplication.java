package com.nextvent.usermanagementservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class UserManagementServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManagementServiceApplication.class, args);
    }
}
