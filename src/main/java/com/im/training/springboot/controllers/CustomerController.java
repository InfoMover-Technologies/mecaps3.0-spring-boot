package com.im.training.springboot.controllers;


import com.im.training.springboot.model.Customer;
import com.im.training.springboot.model.CustomerRepository;
import com.im.training.springboot.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/**
 * GET | POST | PUT | DELETE
 */
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @GetMapping(path = "/customers-view")
    public String handleGetCustomerView(Model model) {

        String customerId = "101";
        String customerName = "JP Morgan";

//        List<Customer> customers = List.of(new Customer(101, "JPMC"),
//                new Customer(102, "Morgan Stanley"),
//                new Customer(103, "Capgemini")
//
//        );
//
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customerId", customerId);
        model.addAttribute("customerName", customerName);

        model.addAttribute("customers", customers);


        return "customers";

    }

}
