package api.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.main.DTO.VendedorDTO;
import api.main.service.VendedorService;

@Controller
@RestController
@RequestMapping(path = "api/v1/vendedor")
public class VendedorController extends BaseController<VendedorDTO>{

	private VendedorService vendedorService;
	
	public VendedorController(VendedorService vendedorService) {
		super(vendedorService);
		this.vendedorService = vendedorService;
	}
	
}
