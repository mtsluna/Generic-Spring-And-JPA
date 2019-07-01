package api.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.main.DTO.ClienteDTO;
import api.main.service.ClienteService;

@Controller
@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteController extends BaseController<ClienteDTO>{

	private ClienteService clienteService;
	
	public ClienteController(ClienteService clienteService) {
		super(clienteService);
		this.clienteService = clienteService;
	}
	
}
