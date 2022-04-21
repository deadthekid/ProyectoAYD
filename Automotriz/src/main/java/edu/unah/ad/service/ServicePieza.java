package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Piezas;
import edu.unah.ad.repository.RepositoryPieza;
@Service
public class ServicePieza {
	@Autowired
	RepositoryPieza repositoryPieza;
	
	public void crearPieza(Piezas pieza) {
		this.repositoryPieza.save(pieza);
	}
	
	public List<Piezas> obtenerTodasPiezas(){
		return this.repositoryPieza.findAll();
	}
	
	public Piezas buscarPieza(int id_pieza) {
		return this.repositoryPieza.findById(id_pieza);
	}
	
	public void eliminarPieza(int id_pieza) {
		this.repositoryPieza.deleteById(id_pieza);
	}
}
