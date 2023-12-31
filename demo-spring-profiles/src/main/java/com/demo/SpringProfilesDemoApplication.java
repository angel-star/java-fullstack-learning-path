package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringProfilesDemoApplication {

    @Value("${app.message}")
    private String message;

    public static void main(String[] args) {

        SpringApplication.run(SpringProfilesDemoApplication.class, args);
    }

    @GetMapping("/")
    public String getMessage() {
        return message;
    }

    //get app.name
    @Value("${app.name}")
    private String name;
    @GetMapping("/name")
    public String getName() {
        return name;
    }

    //get app.description
    @Value("${app.description}")
    private String description;
    @GetMapping("/description")
    public String getDescription() {
        return description;
    }
}
