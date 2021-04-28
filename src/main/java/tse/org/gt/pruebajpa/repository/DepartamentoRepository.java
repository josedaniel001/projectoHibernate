package tse.org.gt.pruebajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import tse.org.gt.pruebajpa.models.Departamento;

public interface DepartamentoRepository extends 
CrudRepository<Departamento, Integer>,
JpaRepository<Departamento, Integer>,
PagingAndSortingRepository<Departamento, Integer>{

	//@Query(value="FROM Departamento d ORDER BY coddep ASC")
	//List<Departamento> findAllcoddep();
}
