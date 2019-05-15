package com.palina.cross.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CrossClientController {

	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
}
