package com.im.training.springboot.services;

import com.im.training.springboot.model.Customer;
import com.im.training.springboot.model.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {



    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getCustomers() {

        return customerDAO.findAll();
    }

    public int activateCustomer() {

        return -1;
        /**
         *
         *
         */
    }


}
