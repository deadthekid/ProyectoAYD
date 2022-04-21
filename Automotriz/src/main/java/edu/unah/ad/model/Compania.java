package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANIA")
public class Compania {
	@Id
	private int id_compania;
	private String nombre;
	
	
	public Compania() {}
	
	public Compania(int id_compania, String nombre) {
		super();
		this.id_compania = id_compania;
		this.nombre = nombre;
	}
	
	public int getId_compania() {
		return id_compania;
	}
	public void setId_compania(int id_compania) {
		this.id_compania = id_compania;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
