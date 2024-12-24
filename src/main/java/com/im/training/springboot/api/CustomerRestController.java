package com.im.training.springboot.api;


import com.im.training.springboot.model.Customer;
import com.im.training.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "/customers")
    public List<Customer> handleGetCustomers() {

        return customerService.getCustomers();
    }
}
