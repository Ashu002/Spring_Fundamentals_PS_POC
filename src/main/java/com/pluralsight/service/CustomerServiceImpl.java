package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImp;

/**
 * Created by ashutosh on 23/7/17.
 */
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImp();
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
