package com.im.training.springboot.services;

import com.im.training.springboot.model.Customer;
import com.im.training.springboot.model.CustomerDAO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {


    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getCustomers() {

        return customerDAO.findAll();
    }

    public Customer getCustomer(int id) {
//        Optional<Customer> optCustomer = customerDAO.findById(id);
//        if (optCustomer.isPresent()) {
//            return optCustomer.get();
//        } else {
//            throw new RuntimeException("Customer not found");
//        }

//        Customer c = customerDAO.findById(id)
//                .orElseThrow();
//
//        return c;


        return customerDAO
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));


    }

    public Customer createCustomer(Customer customer) {

        Optional<Customer> optCustomer = customerDAO
                .findById(customer.getId());
        if (optCustomer.isPresent()) {
            throw new RuntimeException("Customer already exists with id: " + customer.getId());
        }
        return customerDAO.save(customer);
    }

    public Customer updateCustomer(int customerId, Customer customer) {

        Customer existingCustomer = customerDAO
                .findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + customer));
        BeanUtils.copyProperties(customer, existingCustomer, "id");
        return customerDAO.save(existingCustomer);


    }


}
