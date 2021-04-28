package tse.org.gt.pruebajpa.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import libs.utils.locals.RestResponse;
import tse.org.gt.pruebajpa.models.TDpi;
import tse.org.gt.pruebajpa.repository.TDpiRepository;

@RequestMapping("peticionesDpi")
@RestController
public class TDpi_Controller {
	@Autowired
	 TDpiRepository dpicontroller;
	
	@PostMapping("tdpi")
	public List<TDpi> SayData(){
		List<TDpi> data=dpicontroller.findAll();
		return data;
	}
	
	@PostMapping("tdpi_conteo")
	public RestResponse SayConteo() {
		
		RestResponse response=new RestResponse();
		try {
		Long conteo2=dpicontroller.count();		
		response.setData(conteo2.toString());
		}catch(Exception ex) {
		 response.setError(ex);
		}
		return response;
	}
}
