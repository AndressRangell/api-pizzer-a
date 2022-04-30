package com.webservice.uts.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entites.Cliente;


public interface IClienteDao extends CrudRepository<Cliente,Long> {

	@Query("from cliente")
	public List<Cliente> findAllClients();

}