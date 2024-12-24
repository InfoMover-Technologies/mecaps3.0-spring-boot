package com.im.training.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDAO {


    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() {

        return customerRepository.findAll();


    }
}
