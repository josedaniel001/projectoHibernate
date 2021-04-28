package tse.org.gt.pruebajpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import libs.utils.locals.RestResponse;
import tse.org.gt.pruebajpa.models.TRefcomunidad;
import tse.org.gt.pruebajpa.repository.ComunidadRepository;
import tse.org.gt.pruebajpa.repository.TRefcategoriaRepository;
//import tse.org.gt.pruebajpa.repository.TRefcategoriaRepository;

@RestController
@RequestMapping("peticionesTrefCategoria")
public class ComunidadController{
	@Autowired
	 ComunidadRepository repository;
	@Autowired
	 TRefcategoriaRepository repositoryCategoria;
	
	@PostMapping("listAll")
	public RestResponse<TRefcomunidad> listAll() {
		RestResponse response = new RestResponse<TRefcomunidad>();
		try {
			List<TRefcomunidad> data=repository.findAll();
			response.setData(data);
		}catch(Exception ex) {
			response.setError(ex);
		}
		return response;
	}
	
	@PostMapping("listFilterCodmunCoddep/{id}")
	public RestResponse<TRefcomunidad> listFilterCodmunCoddep(Long id) {
		RestResponse response = new RestResponse<TRefcomunidad>();
		try {
			List<TRefcomunidad> data=repository.findAllByCoddepAndCodmun(id);
			response.setData(data);
		}catch(Exception ex) {
			response.setError(ex);
		}
		return response;
	}
	
	@PostMapping("listTrimComunidadCategoria")
	public RestResponse listTrimComunidadCategoria(){
	   RestResponse response = new RestResponse();
	   
	   try {
		   List<TRefcomunidad>comunidad=repository.findAllByEstatus_Active();
		   response.setData(comunidad);
	   }catch(Exception ex) {
		   response.setError(ex);
	   }
	   return response;
	}

}
