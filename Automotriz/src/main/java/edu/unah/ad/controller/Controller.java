package edu.unah.ad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.unah.ad.model.Compania;
import edu.unah.ad.service.ServiceCompania;

@RestController
public class Controller {
	@Autowired
	ServiceCompania serviceCompania;
	
	
	//*******************************************************
	//COMPANIA
	//*******************************************************
	
	@RequestMapping(value= "/compania/crearCompania",method=RequestMethod.GET)
	public Compania crearCompania(@RequestParam(name = "id") int id_compania,
								  @RequestParam(name = "nombre") String nombre){
		
		Compania compania= new Compania(id_compania,nombre);
		this.serviceCompania.crearCompania(compania);
		return compania;
	}
	
	@RequestMapping(value= "/compania/listarCompania",method=RequestMethod.GET)
	public List<Compania> listaCompania(){
		return this.serviceCompania.obtenerTodasCompanias();
	}
	
}
