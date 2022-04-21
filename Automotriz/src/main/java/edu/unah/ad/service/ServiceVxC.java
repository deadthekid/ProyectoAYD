package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.IdVxC;
import edu.unah.ad.model.VehiculosxConcesionaria;
import edu.unah.ad.repository.RepositoryVxC;
@Service
public class ServiceVxC {
	@Autowired
	RepositoryVxC repositoryVxC;
	
	public void crearVxC(VehiculosxConcesionaria vxc) {
		this.repositoryVxC.save(vxc);
	}
	
	public VehiculosxConcesionaria buscarVxC(IdVxC id_vxc) {
		return this.repositoryVxC.getOne(id_vxc);
	}
	
	public List<VehiculosxConcesionaria> obtenerTodosVxC(){
		return this.repositoryVxC.findAll();
	}
	
	public void eliminarCompania(IdVxC id_vxc) {
		this.repositoryVxC.deleteById(id_vxc);
	}
}
