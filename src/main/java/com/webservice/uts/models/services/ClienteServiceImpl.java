package com.webservice.uts.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.uts.models.entites.Cliente;
import com.webservice.uts.models.entites.Pedido;
import com.webservice.uts.models.entites.Pizza;


import com.webservice.uts.models.dao.IClienteDao;
import com.webservice.uts.models.dao.IPedidoDao;
import com.webservice.uts.models.dao.IPizzaDao;

@Service
public class ClienteServiceImpl  implements IClienteService {
	
	@Autowired
	private IClienteDao clienteDao;
	
	
	@Autowired
	private IPedidoDao pedidoDao;
	
	@Autowired
	private IPizzaDao pizzaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
		
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long id) {
		return  clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		 return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}
	
	@Override
	@Transactional(readOnly=true)
	public Pedido findPedidoById(Long id) {
		return pedidoDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Pedido savePedido(Pedido pedido) {
		return pedidoDao.save(pedido);
	}

	@Override
	@Transactional
	public void deletePedidoById(Long id) {
		pedidoDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Pizza> findPizzaByName(String term) {
		return pizzaDao.findByNombre(term);
	}

	@Override
	public List<Pedido> findAllPedidos() {
		 return (List<Pedido>) pedidoDao.findAll();
	}
	

}
