package edu.unah.ad.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROVEEDORES")
public class Proveedores {
	@Id
	private int id_proveedor;
	private String nombre;
	

	
	public Proveedores() {}
	
	public Proveedores(int id_proveedor, String nombre) {
		super();
		this.id_proveedor = id_proveedor;
		this.nombre = nombre;
	}
	
	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
