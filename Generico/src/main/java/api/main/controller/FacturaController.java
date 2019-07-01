package api.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.main.DTO.FacturaDTO;
import api.main.service.FacturaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/factura")
public class FacturaController extends BaseController<FacturaDTO>{

	private FacturaService facturaService;
	
	public FacturaController(FacturaService facturaService) {
		super(facturaService);
		this.facturaService = facturaService;
	}
	
}
