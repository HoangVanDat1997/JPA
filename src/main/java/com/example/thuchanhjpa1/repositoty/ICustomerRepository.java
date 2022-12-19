package com.example.thuchanhjpa1.repositoty;

import com.example.thuchanhjpa1.model.Customer;

public interface ICustomerRepository extends IGeneralRepository{
    void save(Customer customer);
}
