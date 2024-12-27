package com.im.training.springboot;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SampleCronJOB {



    @Scheduled(fixedDelay = 5000L, initialDelay = 3L)
    public void cronJob() {

        System.out.println("cron job executing : " + LocalDateTime.now());
    }


}
