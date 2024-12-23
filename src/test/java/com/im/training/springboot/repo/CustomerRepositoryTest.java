package com.im.training.springboot.repo;

import com.im.training.springboot.model.Customer;
import com.im.training.springboot.model.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerRepositoryTest {


    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void when_new_customer() {

        System.out.println(customerRepository);
        Customer customer = new Customer(101, "JP Morgan");
        customerRepository.save(customer);


    }

}