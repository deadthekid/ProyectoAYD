package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Proveedores;
import edu.unah.ad.repository.RepositoryProveedor;
@Service
public class ServiceProveedor {
	@Autowired
	RepositoryProveedor repositoryProveedor;
	
	public void crearProveedor(Proveedores proveedor) {
		this.repositoryProveedor.save(proveedor);
	}
	
	public List<Proveedores> obtenerTodosProveedores(){
		return this.repositoryProveedor.findAll();
	}
	
	public Proveedores buscarProveedor(int id_proveedor) {
		return this.repositoryProveedor.findById(id_proveedor);
	}
	
	public void eliminarProveedor(int id_proveedor) {
		this.repositoryProveedor.deleteById(id_proveedor);
	}
}
