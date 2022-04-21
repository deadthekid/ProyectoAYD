package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Concesionarios;
import edu.unah.ad.repository.RepositoryConcesionario;
@Service
public class ServiceConcesionario {
	@Autowired
	RepositoryConcesionario repositoryConcesionario;
	
	public void crearConcesionario(Concesionarios concesionario) {
		this.repositoryConcesionario.save(concesionario);
	}
	
	public List<Concesionarios> obtenerTodosConcesionarios(){
		return this.repositoryConcesionario.findAll();
	}
	
	public Concesionarios buscarConcesionario(int id_concesionario) {
		return this.repositoryConcesionario.findById(id_concesionario);
	}
	
	public void eliminarConcesionario(int id_concesionario) {
		this.repositoryConcesionario.deleteById(id_concesionario);
	}
}
