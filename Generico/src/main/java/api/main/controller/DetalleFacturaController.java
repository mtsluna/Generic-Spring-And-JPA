package api.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.main.DTO.DetalleFacturaDTO;
import api.main.service.DetalleFacturaService;

@Controller
@RestController
@RequestMapping(path = "api/v1/detalleFactura")
public class DetalleFacturaController extends BaseController<DetalleFacturaDTO>{

	private DetalleFacturaService detalleFacturaService;
	
	public DetalleFacturaController(DetalleFacturaService detalleFacturaService) {
		super(detalleFacturaService);
		this.detalleFacturaService = detalleFacturaService;
	}
	
}
