package tse.org.gt.pruebajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tse.org.gt.pruebajpa.models.TDpi;

public interface TDpiRepository extends JpaRepository<TDpi, Integer>, CrudRepository<TDpi, Integer> {

}
