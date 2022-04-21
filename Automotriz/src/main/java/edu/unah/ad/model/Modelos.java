package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="MODELOS")
public class Modelos {
	@Id
	private int id_modelo;
	private String nombre;
	private String carroceria;
	
	@ManyToOne
	@JoinColumn(name="id_marca")
	@JsonBackReference
	private Marca marca;
	
	@ManyToOne
	@JoinColumn(name="id_pieza")
	@JsonBackReference
	private Piezas piezas;
	
	
	
	public Modelos() {}
	
	
	public Modelos(int id_modelo, String nombre, String carroceria) {
		super();
		this.id_modelo = id_modelo;
		this.nombre = nombre;
		this.carroceria = carroceria;
	}
	
	public int getId_modelo() {
		return id_modelo;
	}
	public void setId_modelo(int id_modelo) {
		this.id_modelo = id_modelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}	
	
}
