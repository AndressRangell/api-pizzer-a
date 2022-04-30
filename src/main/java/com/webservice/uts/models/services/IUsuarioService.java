package com.webservice.uts.models.services;

import com.webservice.uts.models.entites.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public void delete(Usuario Usuario);

}
