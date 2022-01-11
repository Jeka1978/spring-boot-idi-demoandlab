package com.idi.springbootididemoandlab.dao;

import com.idi.springbootididemoandlab.model.Customer;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface CustomerDao {
    void save(Customer customer);
    List<Customer> findAll();
    List<Customer> findByAgeGreaterThan(int age);

    Customer findById(int id);

}
