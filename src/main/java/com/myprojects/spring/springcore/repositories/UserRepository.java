package com.myprojects.spring.springcore.repositories;

import com.myprojects.spring.springcore.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}

