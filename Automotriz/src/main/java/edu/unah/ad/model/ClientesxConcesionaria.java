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
@Table(name="CLIENTESXCONCESIONARIA")
@IdClass(IdCxC.class)

public class ClientesxConcesionaria implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id_cliente;
	@Id
	private int id_concesionario;
	@Id
	private int id_vehiculo;
	private LocalDate fechacompra;
	
	@ManyToOne
	@JoinColumn(name="id_cliente",referencedColumnName="id_cliente", insertable=false,updatable=false)
	@JsonBackReference
	private Clientes clientes;
	
	@ManyToOne
	@JoinColumn(name="id_concesionario",referencedColumnName="id_concesionario", insertable=false,updatable=false)
	@JsonBackReference
	private Concesionarios concesionarios;
	
	@ManyToOne
	@JoinColumn(name="id_vehiculo",referencedColumnName="id_vehiculo", insertable=false,updatable=false)
	@JsonBackReference
	private Vehiculos vehiculo;
	
	
	
	
	public ClientesxConcesionaria() {}
	
	
	
	



	public ClientesxConcesionaria(int id_cliente, int id_concesionario, int id_vehiculo, LocalDate fechacompra,
			Clientes clientes, Concesionarios concesionarios, Vehiculos vehiculo) {
		super();
		this.id_cliente = id_cliente;
		this.id_concesionario = id_concesionario;
		this.id_vehiculo = id_vehiculo;
		this.fechacompra = fechacompra;
		this.clientes = clientes;
		this.concesionarios = concesionarios;
		this.vehiculo = vehiculo;
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

	public LocalDate getFechacompra() {
		return fechacompra;
	}

	public void setFechacompra(LocalDate fechacompra) {
		this.fechacompra = fechacompra;
	}
	
	
	
	
}
