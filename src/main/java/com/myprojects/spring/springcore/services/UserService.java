package com.myprojects.spring.springcore.services;

import com.myprojects.spring.springcore.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUserName(String userName);

}
