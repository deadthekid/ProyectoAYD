package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Compania;

public interface RepositoryCompania extends JpaRepository<Compania,Integer>{
	public Compania findById(int id_compania);
	public Compania deleteById(int id_compania);
}
