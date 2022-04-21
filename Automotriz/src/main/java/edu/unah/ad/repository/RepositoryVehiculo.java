package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.unah.ad.model.Vehiculos;

public interface RepositoryVehiculo extends JpaRepository<Vehiculos,Integer>{
	public Vehiculos findById(int id_vehiculo);
	public Vehiculos deleteById(int id_vehiculo);
}
