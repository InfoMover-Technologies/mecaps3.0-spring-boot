package com.im.training.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDAO {


    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> findAll() {

        return customerRepository.findAll();


    }

    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }


    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(int customerId) {
        customerRepository.deleteById(customerId);
    }

}
