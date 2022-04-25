package edu.unah.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="VEHICULOS")
public class Vehiculos {
	@Id
	private int id_vehiculo;
	private String vin;
	private String transmision;
	
	@ManyToOne
	@JoinColumn(name="id_color")
	@JsonBackReference
	private Colores colores;
	
	@ManyToOne
	@JoinColumn(name="id_modelo")
	@JsonBackReference
	private Modelos modelos;
	
	
	
	public Vehiculos() {}
	
	
	
	



	public Vehiculos(int id_vehiculo, String vin, String transmision, Colores colores, Modelos modelos) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.vin = vin;
		this.transmision = transmision;
		this.colores = colores;
		this.modelos = modelos;
	}







	public int getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(int id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}



	public Modelos getModelos() {
		return modelos;
	}



	public void setModelos(Modelos modelos) {
		this.modelos = modelos;
	}



	public Colores getColores() {
		return colores;
	}



	public void setColores(Colores colores) {
		this.colores = colores;
	}	
	
	
}
