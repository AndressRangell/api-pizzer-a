package com.webservice.uts.models.dao;



import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entites.Pedido;



public interface IPedidoDao extends CrudRepository<Pedido, Long> {

}