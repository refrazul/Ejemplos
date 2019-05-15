package com.palina.cross.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palina.cross.dto.Mensaje;

/**
 * 
 * @author refrazul@gmail.com
 *
 */
@RestController
public class CrossController {
	
	/**
	 * Verifica el uso la anotación @CrossOrigin
	 * @param nombre
	 * @return
	 */
	//@CrossOrigin(origins = "*")
	@RequestMapping("/saludar/{nombre}")
	public Mensaje saludar(@PathVariable String nombre) {
		return new Mensaje("Hola " + nombre);
	}
	
}