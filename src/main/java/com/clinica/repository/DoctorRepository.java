package com.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.clinica.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{
	
	@Query("select u from Doctor u where u.nom_doc = ?1 and u.ape_doc = ?2")
	  public Doctor buscarPorNombre(String nombre,String apellido);
}
