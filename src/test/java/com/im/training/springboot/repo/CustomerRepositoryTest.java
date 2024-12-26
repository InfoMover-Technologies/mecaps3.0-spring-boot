//package com.im.training.springboot.repo;
//
//import com.im.training.springboot.model.Customer;
//import com.im.training.springboot.model.CustomerRepository;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.Assert;
//
//import java.util.List;
//
//@SpringBootTest
//public class CustomerRepositoryTest {
//
//
//
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @BeforeEach
//    public  void something() {
//
//    }
//
//    @Test
//    public void when_new_customer() {
//
//        System.out.println(customerRepository);
//        Customer customer = new Customer(102, "Wipro");
//        customerRepository.save(customer);
//
//    }
//
//    @Test
//    public void when_find_customers() {
//        List<Customer> customers = customerRepository.findAll();
//        for (Customer customer : customers) {
//            System.out.println(customer);
//        }
//        Assert.isTrue(!customers.isEmpty(), "There should be at least one customer");
//
//    }
//
//
//
//}