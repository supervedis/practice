package com.lumbah.springdemo.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.MapPropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.lumbah.springdemo.dao.OrganizationDao;
import com.lumbah.springdemo.domain.Organization;

@Repository("orgDao")
public class OrganizationDaoImpl implements OrganizationDao {

	//private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParamJdbctemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		namedParamJdbctemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public boolean createOrganization(Organization organization) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(organization);
		String sqlQuery = "INSERT INTO organization(company_name, year_of_incorporation, postal_code, employee_count, slogan)"
				+ "VALUES(:companyName,:yearOfIncorporation,:postalCode,:employeeCount,:slogan)";
		return namedParamJdbctemplate.update(sqlQuery, param) == 1;
//		Object[] org = new Object[] { organization.getCompanyName(), organization.getYearOfIncorporation(),
//				organization.getPostalCode(), organization.getEmployeeCount(), organization.getSlogan() };
		//return jdbcTemplate.update(sqlQuery, org) == 1;
	}

	public Organization getOrganization(Integer id) {
		SqlParameterSource param = new MapSqlParameterSource("ID", id);
		String sqlQuery = "SELECT * FROM organization WHERE id = :id";
		Organization org = namedParamJdbctemplate.queryForObject(sqlQuery, param, new OrganizationRowMapper());
		return org;
//		Object[] arg = new Object[] {id};
//		Organization org = jdbcTemplate.queryForObject(sqlQuery, arg, new OrganizationRowMapper());
//		return org;
	}

	public List<Organization> getAllOrganizations() {
		String sqlQuery = "SELECT * FROM organization";

//		List<Organization> orgs = jdbcTemplate.query(sqlQuery, new OrganizationRowMapper());
		List<Organization> orgs = namedParamJdbctemplate.query(sqlQuery, new OrganizationRowMapper());

		return orgs;
	}

	public boolean delete(Organization organization) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(organization);
		String sqlQuery = "DELETE FROM organization WHERE id = :id";
		return namedParamJdbctemplate.update(sqlQuery, param) == 1;
//		Object[] arg = new Object[] {organization.getId()};
//		
//		return jdbcTemplate.update(sqlQuery, arg) == 1;
	}

	public boolean update(Organization org) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(org);
		String sqlQuery = "UPDATE organization SET slogan = :slogan WHERE id = :id";
		return namedParamJdbctemplate.update(sqlQuery, param) == 1;
//		Object[] arg = new Object[] {org.getSlogan(), org.getId()};
//		
//		return jdbcTemplate.update(sqlQuery, arg) == 1;
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}

}
