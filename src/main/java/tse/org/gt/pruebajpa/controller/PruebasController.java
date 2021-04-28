package tse.org.gt.pruebajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libs.utils.locals.RestResponse;


@RestController
@RequestMapping("pruebasWSDL")
public class PruebasController {

	@GetMapping("listar")
	public RestResponse lista() {
		RestResponse response = new RestResponse();		
		response.setData("Resultado del response");
		return response;
	}
}
