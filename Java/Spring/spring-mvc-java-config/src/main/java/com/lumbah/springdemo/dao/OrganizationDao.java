package com.lumbah.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.lumbah.springdemo.domain.Organization;

public interface OrganizationDao {

	public void setDataSource(DataSource ds);
	
	public boolean createOrganization(Organization organization);
	
	public Organization getOrganization(Integer id);
	
	public List<Organization> getAllOrganizations();
	
	public boolean delete(Organization organization);
	
	public boolean update(Organization org);
	
	public void cleanup();
}
