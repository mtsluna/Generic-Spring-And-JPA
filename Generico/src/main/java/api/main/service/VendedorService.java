package api.main.service;

import org.springframework.stereotype.Service;

import api.main.DTO.VendedorDTO;
import api.main.entity.Vendedor;
import api.main.repository.VendedorRepository;

@Service()
public class VendedorService extends BaseService<Vendedor, VendedorDTO>{

	private VendedorRepository vendedorRepository;
	
	public VendedorService(VendedorRepository vendedorRepository) {
		super(vendedorRepository, VendedorDTO.class, Vendedor.class);
		this.vendedorRepository = vendedorRepository;
	}
	
}
