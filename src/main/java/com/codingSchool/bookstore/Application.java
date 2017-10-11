package com.codingSchool.bookstore;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Here we define the main class that will make our application run.
//Configuration for beans and extra stuff will go here.

@SpringBootApplication
@ComponentScan("com.codingSchool.*")
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}