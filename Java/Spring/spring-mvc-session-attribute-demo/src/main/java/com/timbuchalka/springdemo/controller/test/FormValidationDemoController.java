package com.timbuchalka.springdemo.controller.test;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.timbuchalka.springdemo.service.test.OrganizationRepresentative;

@Controller
@RequestMapping("/formValidationDemo")
public class FormValidationDemoController {

	private static Logger LOGGER = LoggerFactory.getLogger(FormValidationDemoController.class);
	
	@RequestMapping("/home")
	public ModelAndView home(Model model) {
		return new ModelAndView("test/formValidationTestViews/formValidationHome","orgrep", new OrganizationRepresentative());
	}
	
	@RequestMapping(value="/registerOrgRep", method = RequestMethod.POST)
	public String organizationRepresentativeRegistration(@Valid @ModelAttribute("orgrep") OrganizationRepresentative orgRep,
			                                           BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("formerrors", result.getAllErrors());
			List<FieldError> ferrList = result.getFieldErrors();
			
			for(FieldError error: ferrList) {
				LOGGER.info("field error: "+error);
			}
			
			List<ObjectError> gerrorList = result.getGlobalErrors();
			for(ObjectError err: gerrorList) {
				LOGGER.info("Global error: "+err);
			}
			
			return "test/formValidationTestViews/formValidationHome";
		}else {
			return "test/formValidationTestViews/formValidationResult";
		}
	}
}
