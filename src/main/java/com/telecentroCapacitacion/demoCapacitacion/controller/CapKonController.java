package com.telecentroCapacitacion.demoCapacitacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapKonController {

	@GetMapping()
	String Home(){
		
		return "";
	}
}
