package api.main.service;

import org.springframework.stereotype.Service;

import api.main.DTO.ClienteDTO;
import api.main.entity.Cliente;
import api.main.repository.ClienteRepository;

@Service()
public class ClienteService extends BaseService<Cliente, ClienteDTO>{

	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		super(clienteRepository, ClienteDTO.class, Cliente.class);
		this.clienteRepository = clienteRepository;
	}
	
}
