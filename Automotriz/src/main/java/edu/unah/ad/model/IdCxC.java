package edu.unah.ad.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Embeddable
public class IdCxC implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_cliente;
	private int id_concesionario;
	private int id_vehiculo;
	
	public IdCxC() {}
	
	public IdCxC(int id_cliente, int id_concesionario) {
		super();
		this.id_cliente = id_cliente;
		this.id_concesionario = id_concesionario;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof IdCxC) {
			IdCxC tmpid = (IdCxC)obj;
			if(this.id_cliente == tmpid.getId_cliente()
					&& this.id_concesionario == tmpid.getId_concesionario()
					&& this.id_vehiculo == tmpid.getId_vehiculo()) {
				return true;
			}else {
				return false;
			}
		}else {
		return false;
		}
	}
	
	public int hashCode() {
		return (int) this.id_cliente+this.id_concesionario+this.id_vehiculo;
	}
	
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_concesionario() {
		return id_concesionario;
	}
	public void setId_concesionario(int id_concesionario) {
		this.id_concesionario = id_concesionario;
	}

	public int getId_vehiculo() {
		return id_vehiculo;
	}

	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	
	
	
}
