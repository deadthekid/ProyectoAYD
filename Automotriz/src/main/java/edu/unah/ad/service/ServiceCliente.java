package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Clientes;
import edu.unah.ad.repository.RepositoryCliente;

@Service
public class ServiceCliente {
	@Autowired
	RepositoryCliente repositoryCliente;
	
	public void crearCliente(Clientes cliente) {
		this.repositoryCliente.save(cliente);
	}
	
	public List<Clientes> obtenerTodosClientes(){
		return this.repositoryCliente.findAll();
	}
	
	public Clientes buscarCliente(int id_cliente) {
		return this.repositoryCliente.findById(id_cliente);
	}
	
	public void eliminarCliente(int id_cliente) {
		this.repositoryCliente.deleteById(id_cliente);
	}
}
