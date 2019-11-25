package lumbah.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lumbah.springframework.petclinic.service.OwnerService;

@RequestMapping({"/owner"})
@Controller
public class OwnerController {

	private final OwnerService ownerService;
	
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/","/index","/index.html"})
	public String listOwner(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}
}
