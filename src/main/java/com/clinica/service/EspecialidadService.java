package com.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.entity.Especialidad;
import com.clinica.repository.EspecialidadRepository;

@Service
public class EspecialidadService {

	@Autowired
	EspecialidadRepository repository;
	
	public List<Especialidad> listEspecialidad(){
		return repository.findAll();
	}
}
