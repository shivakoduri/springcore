package com.myprojects.spring.springcore.repositories;

import com.myprojects.spring.springcore.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
