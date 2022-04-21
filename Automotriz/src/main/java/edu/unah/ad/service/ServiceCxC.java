package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.ClientesxConcesionaria;
import edu.unah.ad.model.IdCxC;
import edu.unah.ad.repository.RepositoryCxC;

@Service
public class ServiceCxC {
	@Autowired
	RepositoryCxC repositoryCxC;
	
	public void crearCxC(ClientesxConcesionaria cxc) {
		this.repositoryCxC.save(cxc);
	}
	
	public ClientesxConcesionaria buscarCxC(IdCxC id_cxc) {
		return this.repositoryCxC.getOne(id_cxc);
	}
	
	public List<ClientesxConcesionaria> obtenerTodosCxC(){
		return this.repositoryCxC.findAll();
	}
	
	public void eliminarCompania(IdCxC id_cxc) {
		this.repositoryCxC.deleteById(id_cxc);
	}
	
}
