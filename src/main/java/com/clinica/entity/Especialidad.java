package com.clinica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="especialidad")
public class Especialidad {

	@Column(name = "ide_esp")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ide_esp;
	
	@Column(name = "des_esp")
	private String des_esp;

	public int getIde_esp() {
		return ide_esp;
	}

	public void setIde_esp(int ide_esp) {
		this.ide_esp = ide_esp;
	}

	public String getDes_esp() {
		return des_esp;
	}

	public void setDes_esp(String des_esp) {
		this.des_esp = des_esp;
	}
	
	
}
