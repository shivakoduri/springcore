package com.myprojects.spring.springcore.services.reposervices;

import com.myprojects.spring.springcore.commands.CustomerForm;
import com.myprojects.spring.springcore.converters.CustomerFormToCustomer;
import com.myprojects.spring.springcore.domain.Customer;
import com.myprojects.spring.springcore.repositories.CustomerRepository;
import com.myprojects.spring.springcore.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Profile("springdatajpa")
public class CustomerServiceRepoImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerFormToCustomer customerFormToCustomer;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Autowired
    public void setCustomerFormToCustomer(CustomerFormToCustomer customerFormToCustomer) {
        this.customerFormToCustomer = customerFormToCustomer;
    }

    @Override
    public List<?> listAll() {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add); //fun with Java 8
        return customers;
    }

    @Override
    public Customer getById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer saveOrUpdate(Customer domainObject) {
        return customerRepository.save(domainObject);
    }

    @Override
    public Customer saveOrUpdateCustomerForm(CustomerForm customerForm) {
        Customer newCustomer = customerFormToCustomer.convert(customerForm);

        if(newCustomer.getUser().getId() != null){
            Customer existingCustomer = getById(newCustomer.getId());

            newCustomer.getUser().setEnabled(existingCustomer.getUser().getEnabled());
        }

        return saveOrUpdate(newCustomer);
    }

    @Override
    public void delete(Integer id) {
        customerRepository.delete(id);
    }
}

