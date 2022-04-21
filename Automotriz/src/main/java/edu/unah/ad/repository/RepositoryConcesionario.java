package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.unah.ad.model.Concesionarios;

public interface RepositoryConcesionario extends JpaRepository<Concesionarios, Integer>{
	public Concesionarios findById(int id_concesionario);
	public Concesionarios deleteById(int id_concesionario);
}
