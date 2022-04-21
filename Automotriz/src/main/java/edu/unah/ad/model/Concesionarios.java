package edu.unah.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONCESIONARIOS")
public class Concesionarios {
	@Id
	private int id_concesionario;
	private String nombre;
	private String telefono;
	
	public Concesionarios() {}
	
	public Concesionarios(int id_concesionario, String nombre, String telefono) {
		super();
		this.id_concesionario = id_concesionario;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public int getId_concesionario() {
		return id_concesionario;
	}
	public void setId_concesionario(int id_concesionario) {
		this.id_concesionario = id_concesionario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	

}
