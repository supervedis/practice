package com.lumbah.dao;

import java.util.List;

import com.lumbah.entity.Customer;

public interface CustomerDao {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void delete(int id);
}
