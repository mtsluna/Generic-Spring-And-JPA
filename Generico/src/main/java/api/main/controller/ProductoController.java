package api.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.main.DTO.ProductoDTO;
import api.main.entity.Producto;
import api.main.service.ProductoService;

@Controller
@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoController extends BaseController<ProductoDTO>{
	
	private ProductoService productoService;
	
	public ProductoController(ProductoService productoService) {
		super(productoService);
		this.productoService = productoService;
	}
	
}
