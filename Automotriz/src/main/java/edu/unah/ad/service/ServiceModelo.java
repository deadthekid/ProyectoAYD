package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Modelos;
import edu.unah.ad.repository.RepositoryModelo;
@Service
public class ServiceModelo {
	@Autowired
	RepositoryModelo repositoryModelo;
	
	public void crearModelo(Modelos modelo) {
		this.repositoryModelo.save(modelo);
	}
	
	public List<Modelos> obtenerTodosModelos(){
		return this.repositoryModelo.findAll();
	}
	
	public Modelos buscarModelo(int id_modelo) {
		return this.repositoryModelo.findById(id_modelo);
	}
	
	public void eliminarModelo(int id_modelo) {
		this.repositoryModelo.deleteById(id_modelo);
	}
}
