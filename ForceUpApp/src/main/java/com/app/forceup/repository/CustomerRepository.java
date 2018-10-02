package com.app.forceup.repository;
 
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.forceup.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
}