package com.im.training.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * GET | POST | PUT | DELETE
 */
@Controller
public class CustomerController {


    @GetMapping(path = "/customers")
    public String handleGetCustomerView(Model model) {

        String customerId = "101";
        String customerName = "JP Morgan";

        model.addAttribute("customerId", customerId);
        model.addAttribute("customerName", customerName);


        return "customers";

    }

}
