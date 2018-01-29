package com.myprojects.spring.springcore.repositories;

import com.myprojects.spring.springcore.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
