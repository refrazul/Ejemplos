package com.palina.cross.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palina.cross.dto.Mensaje;

@RestController
public class CrossController {
	
	@RequestMapping("/saludar/{nombre}")
	public Mensaje saludar(@PathVariable String nombre) {
		return new Mensaje("Hola " + nombre);
	}
	
}