package com.myprojects.spring.springcore.services;

import com.myprojects.spring.springcore.commands.CustomerForm;
import com.myprojects.spring.springcore.domain.Customer;

public interface CustomerService extends CRUDService<Customer>{

    Customer saveOrUpdateCustomerForm(CustomerForm customerForm);
}

