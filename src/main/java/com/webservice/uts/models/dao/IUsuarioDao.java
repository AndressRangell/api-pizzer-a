package com.webservice.uts.models.dao;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entites.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

	@Query("select u from usuario u where u.username=?1")
	public Usuario findByUsername(String username);

}
