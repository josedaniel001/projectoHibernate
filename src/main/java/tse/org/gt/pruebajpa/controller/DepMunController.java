package tse.org.gt.pruebajpa.controller;

import java.util.*;

import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.*;

import libs.utils.locals.RestResponse;
import tse.org.gt.pruebajpa.models.Departamento;
import tse.org.gt.pruebajpa.models.Municipio;
import tse.org.gt.pruebajpa.repository.DepartamentoRepository;
import tse.org.gt.pruebajpa.repository.MunicipioRepository;

@RestController
@RequestMapping("peticionesDepMun")
public class DepMunController {
	@Autowired
	DepartamentoRepository repositoryDepto;
	@Autowired
	MunicipioRepository repositoryMun;
	
	@PostMapping("listAllDepto")
	public RestResponse<Departamento> listallDepto(){
		RestResponse response = new RestResponse<Departamento>();
		
		try {
			List<Departamento> data= repositoryDepto.findAll();
			response.setData(data);
		}catch(Exception ex) {
			response.setError(ex);
		}
		return response;
	}
	
	@PostMapping("listFilterMunicipio/{id}/{id2}")
	public RestResponse<Municipio> listFilterMunicipio(Long id,Long id2){
		RestResponse response = new RestResponse<Municipio>();
		
		try {
			Collection<Municipio> data= repositoryMun.findAllByCodmun(id,id2);
			response.setData(data);
		}catch(Exception ex) {
			response.setError(ex);
		}
		return response;
	}
	
	@GetMapping("listAllMunicipio")
	public Collection<Municipio>listAllMunicipio(){
		Collection<Municipio> data= repositoryMun.findAll();
		return data;
	}
}
