package com.clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctor")

public class Doctor {

	@Column(name = "ide_doc")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ide_doc;
	private String nom_doc;
	private String ape_doc;
	
	@ManyToOne
	@JoinColumn(name="ide_esp")
	private Especialidad especialidad;
	
	private String tel_doc;
	private String cor_doc;
	
	@ManyToOne
	@JoinColumn(name="ide_dis")
	private Distrito distrito;

	public int getIde_doc() {
		return ide_doc;
	}

	public void setIde_doc(int ide_doc) {
		this.ide_doc = ide_doc;
	}

	public String getNom_doc() {
		return nom_doc;
	}

	public void setNom_doc(String nom_doc) {
		this.nom_doc = nom_doc;
	}

	public String getApe_doc() {
		return ape_doc;
	}

	public void setApe_doc(String ape_doc) {
		this.ape_doc = ape_doc;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public String getTel_doc() {
		return tel_doc;
	}

	public void setTel_doc(String tel_doc) {
		this.tel_doc = tel_doc;
	}

	public String getCor_doc() {
		return cor_doc;
	}

	public void setCor_doc(String cor_doc) {
		this.cor_doc = cor_doc;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	
	
}
