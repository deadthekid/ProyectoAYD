package edu.unah.ad.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {
	@Id
	private int id_cliente;
	private String p_nombre;
	private String s_nombre;
	private String p_apellido;
	private String s_apellido;
	private String direccion;
	private String correo;
	private String telefono;
	private String sexo;
	private int ingresos_anuales;
	
	public Clientes() {}
	
	
	
	public Clientes(int id_cliente, String p_nombre, String s_nombre, String p_apellido, String s_apellido,
			String direccion, String correo, String telefono, String sexo, int ingresos_anuales) {
		super();
		this.id_cliente = id_cliente;
		this.p_nombre = p_nombre;
		this.s_nombre = s_nombre;
		this.p_apellido = p_apellido;
		this.s_apellido = s_apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.sexo = sexo;
		this.ingresos_anuales = ingresos_anuales;
	}



	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getP_nombre() {
		return p_nombre;
	}
	public void setP_nombre(String p_nombre) {
		this.p_nombre = p_nombre;
	}
	public String getS_nombre() {
		return s_nombre;
	}
	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}
	public String getP_apellido() {
		return p_apellido;
	}
	public void setP_apellido(String p_apellido) {
		this.p_apellido = p_apellido;
	}
	public String getS_apellido() {
		return s_apellido;
	}
	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIngresos_anuales() {
		return ingresos_anuales;
	}

	public void setIngresos_anuales(int ingresos_anuales) {
		this.ingresos_anuales = ingresos_anuales;
	}
	
	

}
