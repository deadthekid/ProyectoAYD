package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.Piezas;

public interface RepositoryPieza extends JpaRepository<Piezas,Integer>{
	public Piezas findById(int id_pieza);
	public Piezas deleteById(int id_pieza);
}
