package com.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.entity.Distrito;
import com.clinica.service.DistritoService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
@RequestMapping("/distrito")
public class DistritoController {

	@Autowired
	DistritoService service;
	
	@GetMapping
	public List<Distrito> listarDistritos(){
		return service.listarDistritos();
	}
}
