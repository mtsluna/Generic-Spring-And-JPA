package api.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.main.DTO.ProductoDTO;
import api.main.service.ProductoService;

@Controller
@RestController
@RequestMapping(path = "api/v1/productos")
public class ProductoController {
	
	private ProductoService productoService;
	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@GetMapping("/")
	public List<ProductoDTO> getAll(){
		try {
			
			return productoService.findAll();
			
		} catch(Exception e) {
			
			return new ArrayList<>();
			
		}
		
	}
	
}
