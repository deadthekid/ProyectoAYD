package edu.unah.ad.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Embeddable
public class IdVxC implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_vehiculo;
	private int id_concesionario;
	
	
	
	public IdVxC() {}
	
	public IdVxC(int id_vehiculo, int id_concesionario) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.id_concesionario = id_concesionario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdVxC) {
			IdVxC tmpid = (IdVxC)obj;
			if(this.id_vehiculo == tmpid.getId_vehiculo()
					&& this.id_concesionario == tmpid.getId_concesionario()) {
				return true;
			}else {
				return false;
			}
		}else {
		return false;
		}
	}
	
	public int hashCode() {
		return (int) this.id_vehiculo+this.id_concesionario;
	}
	
	
	public int getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public int getId_concesionario() {
		return id_concesionario;
	}
	public void setId_concesionario(int id_concesionario) {
		this.id_concesionario = id_concesionario;
	}
	
	
}
