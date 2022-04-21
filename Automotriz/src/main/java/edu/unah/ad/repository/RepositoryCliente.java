package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Clientes;

public interface RepositoryCliente extends JpaRepository<Clientes, Integer>{
	public Clientes findById(int id_cliente);
	public Clientes deleteById(int id_cliente);
}
