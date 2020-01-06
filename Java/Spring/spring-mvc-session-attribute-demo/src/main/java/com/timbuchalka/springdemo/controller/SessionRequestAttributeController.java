package com.timbuchalka.springdemo.controller;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.timbuchalka.springdemo.domain.test.Visitor;
import com.timbuchalka.springdemo.domain.test.VisitorCount;
import com.timbuchalka.springdemo.domain.test.VisitorData;
import com.timbuchalka.springdemo.domain.test.VisitorService;

@Controller
@SessionAttributes(names = {"visitordata", "visitorcount"})
@RequestMapping("/visitorRegister")
public class SessionRequestAttributeController {

	@Autowired
	private VisitorService service;
	
	private static Logger LOGGER = LoggerFactory.getLogger(SessionRequestAttributeController.class);
	
	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("test/sessionRequestAttributeViews/sessionRequestAttributeHome","visitorstats", new VisitorData());
	}
	
	@ModelAttribute("visitordata")
	public VisitorData addVisitorData() {
		List<Visitor> visitors = new ArrayList<Visitor>();
		VisitorData vd = new VisitorData(null, null, visitors);
		LOGGER.info("CREATED SESSION VISITOR "+vd);
		return vd;
	}
	
	@ModelAttribute("visitorcount")
	public VisitorCount visitorCounts() {
		VisitorCount vc = new VisitorCount(0);
		return vc;
	}
	
	
	@RequestMapping(value="/visitor", method=RequestMethod.POST)
	public String getVisitors(@ModelAttribute("visitor") VisitorData currentVisitor, HttpSession session, 
			SessionStatus status, HttpServletRequest request,
			@SessionAttribute(name="sessionStartTime") LocalDateTime sessionStartTime, 
			@RequestAttribute(name="currenttime")LocalDateTime clockTime,
			Model model) {
		
		VisitorData visitorDataFromSession = (VisitorData)session.getAttribute("visitordata");
		service.registerVisitor(visitorDataFromSession, currentVisitor); 
		VisitorCount visitorCount = (VisitorCount)session.getAttribute("visitorcount");
		service.updateCount(visitorCount);
		
		Long currentSessionDuration = service.computeDuration(sessionStartTime);
		if(visitorCount.getCount() == 5) {
			status.setComplete();
			session.invalidate();
		}
		
		model.addAttribute("timeHeading", service.describeCurrentTime(sessionStartTime));
		model.addAttribute("durationHeading", service.describeCurrentDuration(currentSessionDuration));
		
		LOGGER.info(visitorDataFromSession.toString());
		
		if(request.getMethod().equalsIgnoreCase("POST")) {
			LOGGER.info("This is a POST request");
		}else {
			LOGGER.info("This is a GET request");
		}
		
		return "test/sessionRequestAttributeViews/sessionRequestAttributeResult";
	}
}
