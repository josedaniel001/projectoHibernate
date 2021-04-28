package tse.org.gt.pruebajpa.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tse.org.gt.pruebajpa.models.Municipio;

@Repository
public interface MunicipioRepository extends
CrudRepository<Municipio, Integer>,
JpaRepository<Municipio, Integer>{
 
  //@Query("FROM Municipio ORDER BY m.coddep DESC")
  //List<Municipio> findAllcodmun();
  
  @Query("FROM Municipio m WHERE m.codmun=?1 and m.coddep=?2")
  Collection<Municipio> findAllByCodmun(Long municipio,Long depto);
  
  @Query("SELECT DISTINCT(m) FROM Municipio m")
  Collection<Municipio>findAllByCodmun();
}
