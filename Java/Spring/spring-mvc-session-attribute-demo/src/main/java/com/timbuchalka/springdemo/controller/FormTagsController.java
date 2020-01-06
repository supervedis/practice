package com.timbuchalka.springdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.timbuchalka.springdemo.domain.OrganizationRegistration;
import com.timbuchalka.springdemo.service.test.OrganizationRegistrationService;

@Controller
@RequestMapping("/formTagsDemo")
public class FormTagsController {

	@Autowired
	private OrganizationRegistrationService service;
	
	@RequestMapping("/home")
	public ModelAndView home(Model model) {
		return new ModelAndView("test/formTagsTestViews/formTagsHome", "orgRegistration", new OrganizationRegistration());
	}
	
	@RequestMapping(value = "/registerOrg", method = RequestMethod.POST)
	public String organizationRegistration(@ModelAttribute OrganizationRegistration organizationReg, Model model) {
		model.addAttribute("orgreg", organizationReg);
		return "test/formTagsTestViews/formTagsResult";
	}
	
	@ModelAttribute
	public void populateTurnover(Model model) {
		Map<String, Object> turnover = model.asMap();
		turnover.put("turnoverList", service.populateTurnover());
		turnover.put("typeList", service.populateTypes());
		turnover.put("serviceLength", service.populateServiceLength());
		turnover.put("registerEarlyList", service.populateRegistrationEarly());
	}
}
