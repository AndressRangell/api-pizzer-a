package com.webservice.uts.models.dao;


import com.webservice.uts.models.entites.Pizza;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IPizzaDao extends CrudRepository<Pizza, Long> {

	@Query("select p from Pizza p where p.nombre like %?1%")
	public List<Pizza> findByNombre(String term);
	
	public List<Pizza> findByNombreContainingIgnoreCase(String term);
	
	public List<Pizza> findByNombreStartingWithIgnoreCase(String term);

}


