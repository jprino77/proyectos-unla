package com.webService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webService.entity.CiudadEntity;

@Repository
public interface CiudadRepository extends CrudRepository<CiudadEntity, Integer>{

	List<CiudadEntity> findTop5ByOrderByCantidadBuscadaDesc();
	
	List<CiudadEntity> findTop30ByNombreContainingIgnoreCaseOrderByNombre(String nombre);
	
	@Modifying(clearAutomatically = true)
	@Query("update ciudad c set c.cantidadBuscada = c.cantidadBuscada + 1 where c.id =:id")
	void sumarCantidadBuscada(@Param("id") Integer id);
}
