package com.im.training.springboot.repo;

import com.im.training.springboot.services.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerServiceTest {


    @Autowired
    CustomerService customerService;

    @Test
    public void when_activate_customer() {

        int count = customerService.activateCustomer();


        Assertions.assertEquals(1, count);






    }
}
