package com.lumbah.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumbah.springdemo.dao.OrganizationDao;
import com.lumbah.springdemo.domain.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;
	
	public List<Organization> getOrgList(){
		List<Organization> organizations = organizationDao.getAllOrganizations();
		return organizations;
	}
}
