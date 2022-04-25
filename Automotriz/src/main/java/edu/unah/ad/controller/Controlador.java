package edu.unah.ad.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import edu.unah.ad.model.Clientes;
import edu.unah.ad.model.ClientesxConcesionaria;
import edu.unah.ad.model.Colores;
import edu.unah.ad.model.Compania;
import edu.unah.ad.model.Concesionarios;
import edu.unah.ad.model.Marca;
import edu.unah.ad.model.Modelos;
import edu.unah.ad.model.Piezas;
import edu.unah.ad.model.Proveedores;
import edu.unah.ad.model.Vehiculos;
import edu.unah.ad.model.VehiculosxConcesionaria;
import edu.unah.ad.service.ServiceCliente;
import edu.unah.ad.service.ServiceColor;
import edu.unah.ad.service.ServiceCompania;
import edu.unah.ad.service.ServiceConcesionario;
import edu.unah.ad.service.ServiceCxC;
import edu.unah.ad.service.ServiceMarca;
import edu.unah.ad.service.ServiceModelo;
import edu.unah.ad.service.ServicePieza;
import edu.unah.ad.service.ServiceProveedor;
import edu.unah.ad.service.ServiceVehiculo;
import edu.unah.ad.service.ServiceVxC;

@Controller
public class Controlador {
	@Autowired
	ServiceCompania serviceCompania;
	
	@Autowired
	ServiceProveedor serviceProveedor;
	
	@Autowired
	ServiceCliente serviceCliente;
	
	@Autowired
	ServicePieza servicePieza;
	
	@Autowired
	ServiceColor serviceColor;
	
	@Autowired
	ServiceConcesionario serviceConcesionario;
	
	@Autowired
	ServiceMarca serviceMarca;
	
	@Autowired
	ServiceModelo serviceModelo;
	
	@Autowired
	ServiceVehiculo serviceVehiculo;
	
	@Autowired
	ServiceCxC servicecxc;
	
	@Autowired
	ServiceVxC servicevxc;

		
	
	@GetMapping("/")
	public String registrarCompania(){
		return "Index";
	}
	
	@GetMapping("/menu/intro")
	public String inicio(){
		return "index2";
	}
	//*******************************************************
	//COMPANIA
	//*******************************************************
	
	@GetMapping("/crear/Compania")
	public String crearCompania(){
		return "CrearCompania";
	}
	
	@GetMapping("/listar/Compania")
	public String listarCompania(){
		return "ListarCompanias";
	}
	
	@GetMapping("/eliminar/Compania")
	public String eliminarCompania(){
		return "EliminarCompania";
	}
	
	@RequestMapping(value= "/companias/crearCompania",method=RequestMethod.POST)
	public String crearCompania(@RequestParam(name = "id") int id_compania,
								  @RequestParam(name = "nombre") String nombre){
		
		Compania compania= new Compania(id_compania,nombre);
		this.serviceCompania.crearCompania(compania);
		return "CrearCompania";
	}
	
	@RequestMapping(value= "/companias/listarCompanias",method=RequestMethod.GET)
	public String listaCompania( Model model){
		List<Compania> companias = this.serviceCompania.obtenerTodasCompanias();
		model.addAttribute("companias", companias);
		return "ListarCompanias";
	}
	
	@RequestMapping(value= "/companias/eliminarCompania",method=RequestMethod.POST)
	public String eliminarCompania(@RequestParam(name = "id") int id_compania){
		this.serviceCompania.eliminarCompania(id_compania);
		return "EliminarCompania";
	}
	
	
	//*******************************************************
	//PROVEEDORES
	//*******************************************************
	@GetMapping("/crear/Proveedor")
	public String crearProveedor(){
		return "CrearProveedor";
	}
	
	@GetMapping("/listar/Proveedor")
	public String listarProveedores(){
		return "ListarProveedor";
	}
	
	@GetMapping("/eliminar/Proveedor")
	public String elimianrProveedores(){
		return "EliminarProveedor";
	}
	@RequestMapping(value= "/proveedores/crearProveedor",method=RequestMethod.POST)
	public String crearProveedor(@RequestParam(name = "id") int id_proveedor,
				     @RequestParam(name = "nombre") String nombre){
		
		Proveedores proveedor= new Proveedores(id_proveedor,nombre);
		this.serviceProveedor.crearProveedor(proveedor);
		return "CrearProveedor";
	}
	
	@RequestMapping(value= "/proveedores/listarProveedores",method=RequestMethod.GET)
	public String listaProveedor( Model model){
		List<Proveedores> proveedor = this.serviceProveedor.obtenerTodosProveedores();
		model.addAttribute("proveedor",proveedor);
		return "ListarProveedor";
	}

	@RequestMapping(value= "/proveedores/eliminarProveedores",method=RequestMethod.POST)
	public String eliminarProveedor(@RequestParam(name = "id") int id_proveedor){
		this.serviceProveedor.eliminarProveedor(id_proveedor);
		return "EliminarProveedor";
	}
	


	//*******************************************************
	//CLIENTES
	//*******************************************************
	@GetMapping("/crear/Cliente")
	public String crearCliente(){
		return "CrearCliente";
	}
	
	@GetMapping("/listar/Cliente")
	public String listarCliente(){
		return "ListarMarca";
	}
	
	@GetMapping("/eliminar/Cliente")
	public String eliminarCliente(){
		return "EliminarCliente";
	}
	
	@RequestMapping(value= "/clientes/crearCliente",method=RequestMethod.POST)
	public String crearCliente    (@RequestParam(name = "id") int id_cliente,
			               @RequestParam(name = "nombre1") String p_nombre,
				       @RequestParam(name = "nombre2") String s_nombre,
				       @RequestParam(name = "nombre3") String p_apellido,
				       @RequestParam(name = "nombre4") String s_apellido,
			               @RequestParam(name = "direccion") String direccion,
				       @RequestParam(name = "correo") String correo,
				       @RequestParam(name = "telefono") String telefono,
				       @RequestParam(name = "sexo") String sexo,
				       @RequestParam(name = "ingresos_anuales") int ingresos_anuales){
		
		Clientes cliente= new Clientes(id_cliente,p_nombre,s_nombre,p_apellido,s_apellido,direccion,correo,telefono,sexo,ingresos_anuales);
		this.serviceCliente.crearCliente(cliente) ;
		return "crearCliente";
	}
	
	@RequestMapping(value= "/clientes/listarClientes",method=RequestMethod.GET)
	public String listadoClientes(Model model){
		List<Clientes> clientes = this.serviceCliente.obtenerTodosClientes();
		model.addAttribute("clientes",clientes);

		return "ListarCliente";
	}
	
	@RequestMapping(value= "/clientes/listarClientes",method=RequestMethod.POST)
	public String eliminarCliente(@RequestParam(name = "id") int id_cliente){
		this.serviceCliente.eliminarCliente(id_cliente);
		return "EliminarCliente";
	}
	
	//*******************************************************
	//PIEZAS
	//*******************************************************
	@GetMapping("/crear/Pieza")
	public String crearPieza(){
		return "CrearPieza";
	}
	
	@GetMapping("/listar/Pieza")
	public String listarPiezas(){
		return "ListarPieza";
	}
	
	@GetMapping("/eliminar/Pieza")
	public String eliminarPieza(){
		return "EliminarPieza";
	}
	@RequestMapping(value= "/piezas/crearPieza",method=RequestMethod.POST)
	public String crearPieza(@RequestParam(name = "id") int id_pieza,
				 @RequestParam(name = "nombre") String nombre,
				 @RequestParam(name = "id_proveedor") int id_proveedor){
		Proveedores proveedor= this.serviceProveedor.buscarProveedor(id_proveedor);
		Piezas piezas = new Piezas(id_pieza,nombre,proveedor);
		 this.servicePieza.crearPieza(piezas);
		
		return "CrearPieza";
	}
	
	@RequestMapping(value= "/piezas/listarPiezas",method=RequestMethod.GET)
	public String listadoPiezas(Model model){
		List<Piezas> piezas = this.servicePieza.obtenerTodasPiezas();
		model.addAttribute("piezas", piezas);
			
		return "ListarPieza";
	}
	
	@RequestMapping(value= "/piezas/eliminarPiezas",method=RequestMethod.POST)
	public String eliminarPiezas(@RequestParam(name = "id") int id_pieza){
		this.servicePieza.eliminarPieza(id_pieza);
		return "EliminarPieza";
	}
	
	//*******************************************************
	//COLOR
	//*******************************************************
	
	@RequestMapping(value= "/colores/crearColor",method=RequestMethod.POST)
	public String crearColor(@RequestParam(name = "id") int id_color,
				 @RequestParam(name = "nombre") String nombre){
		
		Colores color= new Colores(id_color,nombre);
		this.serviceColor.crearColores(color);
		return "crearColor";
	}
	
	@RequestMapping(value= "/colores/listarColores",method=RequestMethod.GET)
	public String listaColores(Model model){
		List<Colores> colores = this.serviceColor.obtenerTodosColores();
		model.addAttribute("colores", colores);

		return "listadoColores";
	}



	
	//*******************************************************
	//CONCESIONARIO
	//*******************************************************
	@GetMapping("/crear/Concesionario")
	public String crearConcesionario(){
		return "CrearConcesionario";
	}
	
	@GetMapping("/listar/Concesionario")
	public String listarConcesionarios(){
		return "ListarConcesionario";
	}
	
	@GetMapping("/eliminar/Concesionario")
	public String eliminarConcesionario(){
		return "EliminarConcesionario";
	}
	@RequestMapping(value= "/concesionarios/crearConcesionario",method=RequestMethod.POST)
	public String crearConcesionario(@RequestParam(name = "id_concesionario") int id_concesionario,
					 @RequestParam(name = "nombre") String nombre,
				         @RequestParam(name = "telefono") String telefono){
		
		Concesionarios concesionario= new Concesionarios(id_concesionario,nombre,telefono);
		this.serviceConcesionario.crearConcesionario(concesionario);
		return "CrearConcesionario";
	}

	
	@RequestMapping(value= "/concesionarios/listarConcesionarios",method=RequestMethod.GET)
	public  String listaConcesionarios(Model model){
		List<Concesionarios> concesionarios = this.serviceConcesionario.obtenerTodosConcesionarios();
		model.addAttribute("concesionarios",concesionarios);
		return "ListarConcesionario";
	}

	@RequestMapping(value= "/concesionarios/eliminarConcesionarios",method=RequestMethod.POST)
	public String eliminarConcesionarios(@RequestParam(name = "id_concesionario") int id_concesionario){
		this.serviceConcesionario.eliminarConcesionario(id_concesionario);
		return "EliminarConcesionario";
	}
	
	
	//*******************************************************
	//MARCA
	//*******************************************************
	@GetMapping("/crear/Marca")
	public String crearMarca(){
		return "CrearMarca";
	}
	
	@GetMapping("/listar/Marca")
	public String listarMarcas(){
		return "ListarMarca";
	}
	
	@GetMapping("/eliminar/Marca")
	public String eliminarMarca(){
		return "EliminarMarca";
	}
	
	@RequestMapping(value= "/marcas/crearMarca",method=RequestMethod.POST)
	public String crearMarca(@RequestParam(name = "id") int id_marca,
				 @RequestParam(name = "nombre") String nombre,
				 @RequestParam(name = "id_compania") int id_compania){
	Compania compania = this.serviceCompania.buscarCompania(id_compania);
	Marca marca= new Marca(id_marca,nombre,compania);
	this.serviceMarca.crearMarca(marca);
	return "CrearMarca";
	}
		
	@RequestMapping(value= "/marcas/listarMarcas",method=RequestMethod.GET)
	public String listaMarcas(Model model){
	List<Marca> marcas = this.serviceMarca.obtenerTodasMarcas();
	model.addAttribute("marcas",marcas);

	return "ListarMarca";
	}

	
	@RequestMapping(value= "/marcas/eliminarMarca",method=RequestMethod.POST)
	public String eliminarMarca(@RequestParam(name = "id") int id_marca){
		this.serviceMarca.eliminarMarca(id_marca);
		return "EliminarMarca";
	}
	

	//*******************************************************
	//MODELO
	//*******************************************************
	@GetMapping("/crear/Modelo")
	public String crearModelo(){
		return "CrearModelo";
	}
	
	@GetMapping("/listar/Modelo")
	public String listarModelo(){
		return "ListarModelo";
	}
	
	@GetMapping("/eliminar/Modelo")
	public String eliminarModelo(){
		return "EliminarModelo";
	}
	@RequestMapping(value= "/modelos/crearModelo",method=RequestMethod.POST)
	public String crearModelo(@RequestParam(name = "id") int id_modelo,
				  @RequestParam(name = "nombre") String nombre,
			          @RequestParam(name = "carroceria") String carroceria,
			          @RequestParam(name = "id_marca") int id_marca,
			          @RequestParam(name = "id_pieza") int id_pieza){
	Marca marca= this.serviceMarca.buscarMarca(id_marca);
	Piezas pieza= this.servicePieza.buscarPieza(id_pieza);
	
	Modelos modelo= new Modelos(id_modelo,nombre,carroceria,marca,pieza);
	
		
	this.serviceModelo.crearModelo(modelo);
	return "CrearModelo";
	}
		
	@RequestMapping(value= "/modelos/listarModelos",method=RequestMethod.GET)
	public String listaModelos(Model model){
	List<Modelos> modelos = this.serviceModelo.obtenerTodosModelos();
	model.addAttribute("modelos", modelos);

	return "ListarModelo"; 
	}
	
	@RequestMapping(value= "/modelos/eliminarModelo",method=RequestMethod.POST)
	public String eliminarModelo(@RequestParam(name = "id") int id_modelo){
		this.serviceModelo.eliminarModelo(id_modelo);
		return "EliminarModelo";
	}
	
	
	
	//*******************************************************
	//VEHICULOS
	//*******************************************************
	@GetMapping("/crear/Vehiculos")
	public String crearVehiculo(){
		return "CrearVehiculo";
	}
	
	@GetMapping("/listar/Vehiculos")
	public String listarVehiculos(){
		return "ListarVehiculo";
	}
	
	@GetMapping("/eliminar/Vehiculos")
	public String eliminarVehiculo(){
		return "EliminarVehiculo";
	}
	
	@RequestMapping(value= "/vehiculos/crearVehiculo",method=RequestMethod.POST)
	public String crearVehiculo(@RequestParam(name = "id") int id_vehiculo,
				    @RequestParam(name = "vin") String vin,
				    @RequestParam(name = "transmision") String transmision,
		  		    @RequestParam(name = "id_modelo") int id_modelo,
				    @RequestParam(name = "id_color") int id_color){
	Modelos modelo= this.serviceModelo.buscarModelo(id_modelo);
	Colores color=this.serviceColor.buscarColor(id_color);
	Vehiculos vehiculo=new Vehiculos(id_vehiculo,vin,transmision,color,modelo);
	this.serviceVehiculo.crearVehiculo(vehiculo);
			
	return "CrearVehiculo";
	}
		
	@RequestMapping(value= "/vehiculos/listarVehiculos",method=RequestMethod.GET)
	public String listaVehiculos(Model model){
	List<Vehiculos> vehiculos = this.serviceVehiculo.obtenerTodosVehiculos();
	model.addAttribute("vehiculos", vehiculos);

	return "ListarVehiculo";
	}

	@RequestMapping(value= "/vehiculos/eliminarVehiculos",method=RequestMethod.POST)
	public String eliminarVehiculos(@RequestParam(name = "id") int id_vehiculo){
		this.serviceVehiculo.eliminarVehiculo(id_vehiculo);
		return "EliminarVehiculo";
	}
		
	
	
	//*******************************************************
	//CLIENTES X CONCESIONARIOS
	//*******************************************************
	
	@RequestMapping(value= "/cxc/crearCxc",method=RequestMethod.POST)
	public String crearClientesxConcesionaria(@RequestParam(name = "idCliente") int id_cliente,
					@RequestParam(name = "idConcesionario") int id_concesionario,
					@RequestParam(name = "idVehiculo") int id_vehiculo,
					@RequestParam(name="FechaCompra") @DateTimeFormat(iso = ISO.DATE) LocalDate fechacompra) {
			
	Clientes tmpcliente= this.serviceCliente.buscarCliente(id_cliente) ;
	Concesionarios tmpConcesionarios = this.serviceConcesionario.buscarConcesionario(id_concesionario);
	Vehiculos tmpVehiculo = this.serviceVehiculo.buscarVehiculo(id_vehiculo);
	
	ClientesxConcesionaria tmpClientesXConcesionario = new ClientesxConcesionaria(id_cliente, id_concesionario, id_vehiculo, fechacompra, tmpcliente, tmpConcesionarios, tmpVehiculo);
	
	this.servicecxc.crearCxC(tmpClientesXConcesionario);
	return "crearCxC";
	
	}
		
	@RequestMapping(value= "/cxc/ListarCxc",method=RequestMethod.GET)
	public String listaCxC(Model model){
	List<ClientesxConcesionaria> CxC = this.servicecxc.obtenerTodosCxC();
	model.addAttribute("CxC", CxC);

	return "listarCxC";
	}


		
	
	
	//*******************************************************
	//VEHICULOS X CONCESIONARIOS
	//*******************************************************	
	
	@RequestMapping(value= "/Vxc/crearvxc", method=RequestMethod.POST)
	public String crearVehiculosxConcesionaria(@RequestParam(name = "idVehiculo") int id_vehiculo,
						   @RequestParam(name = "idConcesionario") int id_concesionario,
						   @RequestParam(name= "FechaCompra") @DateTimeFormat(iso = ISO.DATE) LocalDate fechacompra){
	
	Vehiculos tmpVehiculo = this.serviceVehiculo.buscarVehiculo(id_vehiculo);
	Concesionarios tmpConcesionarios = this.serviceConcesionario.buscarConcesionario(id_concesionario);
	
	
	VehiculosxConcesionaria tmpVehiculosXConcesionaria = new VehiculosxConcesionaria(id_vehiculo,id_concesionario, fechacompra,tmpVehiculo,tmpConcesionarios);
	
	this.servicevxc.crearVxC(tmpVehiculosXConcesionaria);
	return "crearVxC";
	
	}
		
	@RequestMapping(value= "/vxc/ListarVxC",method=RequestMethod.GET)
	public String listaVxC(Model model){
	List<VehiculosxConcesionaria> VxC = this.servicevxc.obtenerTodosVxC();
	model.addAttribute("VxC", VxC);

	return "listarVxC";
	}
}




