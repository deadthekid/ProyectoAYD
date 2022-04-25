package edu.unah.ad.model;



import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(name="VEHICULOXCONCESIONARIA")
@IdClass(IdVxC.class)
public class VehiculosxConcesionaria implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id_vehiculo;
	@Id
	private int id_concesionario;
	private LocalDate fechacompra;
	
	@ManyToOne
	@JoinColumn(name="id_vehiculo",referencedColumnName="id_vehiculo", insertable=false,updatable=false)
	@JsonBackReference
	private Vehiculos vehiculos;
	
	@ManyToOne
	@JoinColumn(name="id_concesionario",referencedColumnName="id_concesionario", insertable=false,updatable=false)
	@JsonBackReference
	private Concesionarios concesionarios;
	
	
	public VehiculosxConcesionaria() {}
	

	
	public VehiculosxConcesionaria(int id_vehiculo, int id_concesionario, LocalDate fechacompra, Vehiculos vehiculos,
			Concesionarios concesionarios) {
		super();
		this.id_vehiculo = id_vehiculo;
		this.id_concesionario = id_concesionario;
		this.fechacompra = fechacompra;
		this.vehiculos = vehiculos;
		this.concesionarios = concesionarios;
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
	public LocalDate getFecha() {
		return fechacompra;
	}
	public void setFecha(LocalDate fechacompra) {
		this.fechacompra = fechacompra;
	}
	
	

}
