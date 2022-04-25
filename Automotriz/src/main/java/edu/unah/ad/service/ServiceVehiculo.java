package edu.unah.ad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unah.ad.model.Vehiculos;
import edu.unah.ad.repository.RepositoryVehiculo;
@Service
public class ServiceVehiculo {
	@Autowired
	RepositoryVehiculo repositoryVehiculo;
	
	public void crearVehiculo(Vehiculos vehiculo) {
		this.repositoryVehiculo.save(vehiculo);
	}
	
	public List<Vehiculos> obtenerTodosVehiculos(){
		return this.repositoryVehiculo.findAll();
	}
	
	public Vehiculos buscarVehiculo(int id_vehiculo) {
		return this.repositoryVehiculo.findById(id_vehiculo);
	}
	
	public void eliminarVehiculo(int id_vehiculo) {
		this.repositoryVehiculo.deleteById(id_vehiculo);
	}
}
