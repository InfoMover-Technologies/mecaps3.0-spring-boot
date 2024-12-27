package com.im.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringTrainingApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringTrainingApplication.class, args);


    }

}
