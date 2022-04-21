package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Colores;


public interface RepositoryColor extends JpaRepository<Colores,Integer>{
	public Colores findById(int id_color);
	public Colores deleteById(int id_color);
}
