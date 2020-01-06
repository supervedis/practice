package com.timbuchalka.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ModelAttributeController {

	@RequestMapping(value="/home2")
	public String home() {
		return "modelAndAttribute";
	}
}
