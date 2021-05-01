package com.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.entity.Especialidad;
import com.clinica.service.EspecialidadService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
@RequestMapping("/especialidad")
public class EspecialidadController {

	@Autowired
	EspecialidadService service;
	
	@GetMapping
	public List<Especialidad> listarEspecialidad(){
		return service.listEspecialidad();
	}
}
