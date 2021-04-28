package tse.org.gt.pruebajpa.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libs.utils.locals.DateTools;
import libs.utils.locals.RestResponse;
import tse.org.gt.pruebajpa.models.TRefcategoria;
import tse.org.gt.pruebajpa.repository.TRefcategoriaRepository;

@RestController
@RequestMapping("peticionesTrefCategoria")
public class TrefCategoria_Controller{
 @Autowired
 TRefcategoriaRepository categoriaRepository;
 

 
	@PostMapping("listarFechas/{Id}")
	
	public RestResponse listarFechas(@PathVariable Long Id) {		
		RestResponse response= new RestResponse();
		try {
		 DateTools fechaTool= new DateTools();
		 List <TRefcategoria> categoria = categoriaRepository
				 						  .findBycodigoCategoria(Id);
		 response.setData(categoria);
		}catch(Exception ex) {
		 response.setError(ex);
		}
		return response; 
	 }
	
	@PostMapping("list")	
	public RestResponse listar() {
		RestResponse response=new RestResponse();
		try {		
		 List<TRefcategoria> data=categoriaRepository.findAll(Sort.by(Direction.ASC, "codigoCategoria"));
			response.setData(data);
		}catch(Exception e) {
			response.setError(e);
		}
		return response;
	}
		
}
