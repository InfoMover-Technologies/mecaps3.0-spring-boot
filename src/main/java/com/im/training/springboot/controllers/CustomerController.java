package com.im.training.springboot.controllers;


import com.im.training.springboot.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/**
 * GET | POST | PUT | DELETE
 */
@Controller
public class CustomerController {


    @GetMapping(path = "/customers")
    public String handleGetCustomerView(Model model) {

        String customerId = "101";
        String customerName = "JP Morgan";

        List<Customer> customers = List.of(new Customer(101, "JPMC"),
                new Customer(102, "Morgan Stanley"),
                new Customer(103, "Capgemini")

        );
//
        model.addAttribute("customerId", customerId);
        model.addAttribute("customerName", customerName);

        model.addAttribute("customers", customers);


        return "customers";

    }

}
