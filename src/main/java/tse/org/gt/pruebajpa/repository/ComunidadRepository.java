package tse.org.gt.pruebajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import tse.org.gt.pruebajpa.models.TRefcategoria;
import tse.org.gt.pruebajpa.models.TRefcomunidad;

public interface ComunidadRepository extends  
JpaRepository<TRefcomunidad, Integer>{
		 
	@Query("SELECT c from TRefcomunidad c WHERE rownum<=?1")
	List<TRefcomunidad> findAllByCoddepAndCodmun(Long datos);
	
	@Query("from TRefcomunidad c WHERE c.estatus=1")
	List<TRefcomunidad> findAllByEstatus_Active();
}
