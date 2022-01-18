package com.idi.springbootididemoandlab.dao;

import com.idi.springbootididemoandlab.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface CustomerDao extends JpaRepository<Customer,Integer> {


    List<Customer> findByAgeGreaterThan(int age);

//    @Query(value = "from ccc ")
//    @Procedure(procedureName = "SP_117")
    List<Customer> findByNameContainingIgnoreCase(String partOfName);



}
