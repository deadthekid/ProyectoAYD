package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COLORES")
public class Colores {
	@Id
	private int id_color;
	private String nombre;
	
	
	
	
	public Colores() {}
	
	public Colores(int id_color, String nombre) {
		super();
		this.id_color = id_color;
		this.nombre = nombre;
	}
	
	public int getId_color() {
		return id_color;
	}
	public void setId_color(int id_color) {
		this.id_color = id_color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
}
