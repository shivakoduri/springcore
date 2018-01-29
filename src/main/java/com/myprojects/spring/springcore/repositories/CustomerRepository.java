package com.myprojects.spring.springcore.repositories;

import com.myprojects.spring.springcore.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
