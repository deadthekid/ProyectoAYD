package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.unah.ad.model.Modelos;

public interface RepositoryModelo extends JpaRepository<Modelos,Integer>{
	public Modelos findById(int id_modelo);
	public Modelos deleteById(int id_modelo);
}
