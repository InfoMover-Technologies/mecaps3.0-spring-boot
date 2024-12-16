package com.im.training.springboot.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * GET | POST | PUT | DELETE
 *
 */
@Controller
public class CustomerController {


    @GetMapping(path = "/customers")
    public String handleGetCustomerView() {

        return "customers";

    }

}
