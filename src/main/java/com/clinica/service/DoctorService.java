package com.clinica.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinica.entity.Doctor;
import com.clinica.repository.DoctorRepository;

@Service
public class DoctorService{

	@Autowired
	DoctorRepository repository;
	

	public List<Doctor> listarDoctores() {
		return repository.findAll();
	}


	public Doctor insertarDoctor(Doctor bean) {
		return repository.save(bean);
	}


	public Doctor obtenerDoctor(Integer id) {
		return repository.findById(id).get();
	}


	public Doctor actualizarDoctor(Doctor bean) {
		return repository.save(bean);
	}


	public void eliminarDoctor(Integer id) {
		repository.deleteById(id);
		
	}
	
	 public Doctor buscarPorNombre(String nombre,String apellido) {
		 return repository.buscarPorNombre(nombre,apellido);
	 }

}
