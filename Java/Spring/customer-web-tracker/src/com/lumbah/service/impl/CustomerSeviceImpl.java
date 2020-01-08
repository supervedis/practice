package com.lumbah.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumbah.dao.CustomerDao;
import com.lumbah.entity.Customer;
import com.lumbah.service.CustomerService;

@Service
public class CustomerSeviceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		Customer customer = customerDao.getCustomer(id);
		return customer;
	}

	@Override
	@Transactional
	public void delete(int id) {
		customerDao.delete(id);
		
	}

}
