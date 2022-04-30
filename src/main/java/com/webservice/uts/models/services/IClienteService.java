package com.webservice.uts.models.services;

import java.util.List;

import com.webservice.uts.models.entites.Cliente;
import com.webservice.uts.models.entites.Pedido;
import com.webservice.uts.models.entites.Pizza;


public interface IClienteService {
	
    public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);
	
	public List<Cliente> findAllClients();
	
        public Pedido findPedidoById(Long id);
	
	public List<Pedido> findAllPedidos();
	
	public Pedido savePedido(Pedido pedido);
	
	public void deletePedidoById(Long id);
	
	public List<Pizza> findPizzaByName(String term);
	

}