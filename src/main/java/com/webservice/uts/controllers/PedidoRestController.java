package com.webservice.uts.controllers;

import com.webservice.uts.models.entites.Pedido;
import com.webservice.uts.models.entites.Pizza;
import com.webservice.uts.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PedidoRestController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping("/pedido/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Pedido show(@PathVariable Long id) {
		return clienteService.findPedidoById(id);
	}


	@GetMapping("/pedido")
	@ResponseStatus(HttpStatus.OK)
	public List<Pedido> index() {
		return clienteService.findAllPedidos();
	}

	@DeleteMapping("/pedido/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.deletePedidoById(id);
	}

	@GetMapping("/pedido/filtrar-pizzas/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Pizza> filtrarPizzas(@PathVariable String term){
		return clienteService.findPizzaByName(term);
	}

	@PostMapping("/pedido")
	@ResponseStatus(HttpStatus.CREATED)
	public Pedido crear(@RequestBody Pedido pedido) {
		return clienteService.savePedido(pedido);
	}
	
	
	

}

