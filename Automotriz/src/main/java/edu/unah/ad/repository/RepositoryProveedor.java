package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Proveedores;

public interface RepositoryProveedor extends JpaRepository<Proveedores, Integer>{
	public Proveedores findById(int id_proveedor);
	public Proveedores deleteById(int id_proveedor);
}
