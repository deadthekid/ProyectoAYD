package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Colores;
import edu.unah.ad.repository.RepositoryColor;
@Service
public class ServiceColor {
	@Autowired
	RepositoryColor repositoryColor;
	
	public void crearColores(Colores color) {
		this.repositoryColor.save(color);
	}
	
	public List<Colores> obtenerTodosColores(){
		return this.repositoryColor.findAll();
	}
	
	public Colores buscarColor(int id_color) {
		return this.repositoryColor.findById(id_color);
	}
	
	public void eliminarColor(int id_compania) {
		this.repositoryColor.deleteById(id_compania);
	}
}
