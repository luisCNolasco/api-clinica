package com.clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distrito")
public class Distrito {
	
	@Column(name="ide_dis")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ide_dis;
	
	@Column(name = "nom_dis")
	private String nom_dis;

	public int getIde_dis() {
		return ide_dis;
	}

	public void setIde_dis(int ide_dis) {
		this.ide_dis = ide_dis;
	}

	public String getNom_dis() {
		return nom_dis;
	}

	public void setNom_dis(String nom_dis) {
		this.nom_dis = nom_dis;
	}
	
	
}
