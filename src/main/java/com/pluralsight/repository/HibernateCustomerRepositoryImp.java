package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

/**
 * Created by ashutosh on 23/7/17.
 */
public class HibernateCustomerRepositoryImp implements CustomerRepository {

	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Raj");
		customer.setLastName("Ojha");
		customers.add(customer);
		return customers;
	}
}
