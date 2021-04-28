package tse.org.gt.pruebajpa.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tse.org.gt.pruebajpa.models.TRefcategoria;

public interface TRefcategoriaRepository extends JpaRepository<TRefcategoria, Integer >, CrudRepository<TRefcategoria, Integer>{

	//boolean existByEstandarCategoria(Long id);
	List<TRefcategoria> findBycodigoCategoria(Long id);
	
	
}
