package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Compania;
import edu.unah.ad.repository.RepositoryCompania;

@Service
public class ServiceCompania {
	@Autowired
	RepositoryCompania repositoryCompania;
	
	public void crearCompania(Compania compania) {
		this.repositoryCompania.save(compania);
	}
	
	public List<Compania> obtenerTodasCompanias(){
		return this.repositoryCompania.findAll();
	}
	
	public Compania buscarCompania(int id_compania) {
		return this.repositoryCompania.findById(id_compania);
	}
	
	public void eliminarCompania(int id_compania) {
		this.repositoryCompania.deleteById(id_compania);
	}
}
