package com.im.training.springboot.api;


import com.im.training.springboot.model.Customer;
import com.im.training.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/customers/{customerId}")
    public Customer handleGetCustomer(@PathVariable int customerId) {
        return customerService.getCustomer(customerId);
    }

    @GetMapping(path = "/customers", params = {"city"})
    public List<Customer> handleGetCustomersByCity(@RequestParam String city) {

        return List.of();
    }

    @PostMapping(path = "/customers")
    public Customer handlePostCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);

    }

    @PutMapping(path="/customers/{customerId}")
    public Customer handlePutCustomer(@PathVariable int customerId, @RequestBody Customer customer) {
        return customerService.updateCustomer(customerId, customer);
    }


}
