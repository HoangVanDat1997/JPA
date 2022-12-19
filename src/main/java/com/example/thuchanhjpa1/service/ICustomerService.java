package com.example.thuchanhjpa1.service;

import com.example.thuchanhjpa1.model.Customer;

public interface ICustomerService extends IGeneralService{
    void save(Customer customer);
}
