package com.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clinica.entity.Doctor;
import com.clinica.service.DoctorService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorService service;
	
	@GetMapping
	public List<Doctor> listaDoctores(){
		return service.listarDoctores();
	}
	
	@PostMapping
	public Doctor insertarDoctor(@RequestBody Doctor bean) {
		return service.insertarDoctor(bean);
	}
	
	@GetMapping("/{id}")
	public Doctor obtenerDoctor(@PathVariable("id") Integer id) {
		return service.obtenerDoctor(id);
	}
	
	@GetMapping("/buscar/{nombre}/{apellido}")
	 public Doctor buscarPorNombre(@PathVariable("nombre") String nombre,@PathVariable("apellido") String apellido) {
		 return service.buscarPorNombre(nombre,apellido);
	 }
	
	@PutMapping
	public Doctor actualizarDoctor(@RequestBody Doctor bean) {
		return service.actualizarDoctor(bean);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarDoctor(@PathVariable("id") Integer id) {
		service.eliminarDoctor(id);
	}
}
