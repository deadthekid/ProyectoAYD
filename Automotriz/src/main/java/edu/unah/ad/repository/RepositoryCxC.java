package edu.unah.ad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unah.ad.model.ClientesxConcesionaria;
import edu.unah.ad.model.IdCxC;

public interface RepositoryCxC extends JpaRepository<ClientesxConcesionaria,IdCxC>{

}
