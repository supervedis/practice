package com.timbuchalka.springdemo.service.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrganizationRegistrationService {

	@Value("#{serviceLengthOptions}")
	private Map<String, String> serviceLength;
	
	public Map<String, String> populateTurnover(){
		Map<String, String> turnover = new LinkedHashMap<String, String>();
		turnover.put("none", "------SELECT------");
		turnover.put("1000", "Less than a $1000");
		turnover.put("10000", "Greater than $1,000 and less than a $10,000");
		turnover.put("100000", "Greater than $10,000 and less than a $100,000");
		return turnover;
	}
	
	public Map<String, String> populateTypes(){
		Map<String, String> types = new LinkedHashMap<String, String>();
		types.put("gov", "Government");
		types.put("semigov", "Semi Government");
		types.put("100000", "Private");
		return types;
	}
	
	public Map<String, String> populateServiceLength(){
		return new TreeMap<String, String>(serviceLength);
	}
	
	public Map<String, String> populateRegistrationEarly(){
		Map<String, String> registration = new LinkedHashMap<String, String>();
		registration.put("true", "Yes");
		registration.put("false", "No");
		return registration;
	}
}
