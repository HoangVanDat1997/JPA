package com.example.thuchanhjpa1.service;

import com.example.thuchanhjpa1.model.Customer;
import com.example.thuchanhjpa1.repositoty.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return (Customer) customerRepository.findById(id);
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);

    }
}
