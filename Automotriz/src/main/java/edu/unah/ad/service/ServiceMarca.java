package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Marca;
import edu.unah.ad.repository.RepositoryMarca;
@Service
public class ServiceMarca {
	@Autowired
	RepositoryMarca repositoryMarca;
	
	public void crearMarca(Marca marca) {
		this.repositoryMarca.save(marca);
	}
	
	public List<Marca> obtenerTodasMarcas(){
		return this.repositoryMarca.findAll();
	}
	
	public Marca buscarMarca(int id_marca) {
		return this.repositoryMarca.findById(id_marca);
	}
	
	public void eliminarMarca(int id_marca) {
		this.repositoryMarca.deleteById(id_marca);
	}
}
