package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="PIEZAS")
public class Piezas {
	@Id
	private int id_pieza;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="id_proveedor")
	@JsonBackReference
	private Proveedores proveedores;
	
	public Piezas() {}
	
	
	
	public Piezas(int id_pieza, String nombre, Proveedores proveedores) {
		super();
		this.id_pieza = id_pieza;
		this.nombre = nombre;
		this.proveedores = proveedores;
	}



	public int getId_pieza() {
		return id_pieza;
	}
	public void setId_pieza(int id_pieza) {
		this.id_pieza = id_pieza;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Proveedores getProveedores() {
		return proveedores;
	}



	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}
	
	
	
}
