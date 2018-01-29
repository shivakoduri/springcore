package com.myprojects.spring.springcore.repositories;

import com.myprojects.spring.springcore.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepsoitory  extends CrudRepository<Role, Integer> {
}
