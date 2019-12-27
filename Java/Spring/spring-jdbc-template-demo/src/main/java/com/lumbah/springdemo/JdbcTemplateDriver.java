package com.lumbah.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lumbah.springdemo.dao.OrganizationDao;
import com.lumbah.springdemo.daoimpl.OrganizationDaoImpl;
import com.lumbah.springdemo.domain.Organization;

public class JdbcTemplateDriver {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		OrganizationDao  dao = (OrganizationDaoImpl)ctx.getBean("orgDao");
		
		DaoUtils.createSeedData(dao);
		
		List<Organization> orgs = dao.getAllOrganizations();
		DaoUtils.printOrganizationCount(orgs, DaoUtils.readOperation);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
