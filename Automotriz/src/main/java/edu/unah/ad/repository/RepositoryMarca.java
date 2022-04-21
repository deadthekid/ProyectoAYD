package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Marca;

public interface RepositoryMarca extends JpaRepository<Marca,Integer>{
	public Marca findById(int id_marca);
	public Marca deleteById(int id_marca);
}
