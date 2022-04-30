package com.webservice.uts.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.uts.models.entites.Pedido;
import com.webservice.uts.models.entites.Pizza;
import com.webservice.uts.models.services.IClienteService;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;



@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PedidoRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/pedido/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Pedido show(@PathVariable Long id) {
		return clienteService.findPedidoById(id);
	}

	
	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/pedido")
	@ResponseStatus(HttpStatus.OK)
	public List<Pedido> index() {
		return clienteService.findAllPedidos();
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/pedido/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deletePedidoById(id);
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/pedido/filtrar-pizzas/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Pizza> filtrarPizzas(@PathVariable String term){
		return clienteService.findPizzaByName(term);
	}
	
	@Secured({"ROLE_ADMIN"})
	@PostMapping("/pedido")
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido crear(@RequestBody Pedido pedido) {
		return clienteService.savePedido(pedido);
	}
	
	
	

}

