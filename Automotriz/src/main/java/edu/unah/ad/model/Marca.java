package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="MARCA")
public class Marca {
	@Id
	private int id_marca;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_compania")
	@JsonBackReference
	private Compania compania;
	
	
	
	public Marca() {}
	
	public Marca(int id_marca, String nombre) {
		super();
		this.id_marca = id_marca;
		this.nombre = nombre;
	}
	
	
	public int getId_marca() {
		return id_marca;
	}
	public void setId_marca(int id_marca) {
		this.id_marca = id_marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
	
	

