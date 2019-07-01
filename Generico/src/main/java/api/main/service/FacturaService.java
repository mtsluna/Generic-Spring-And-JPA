package api.main.service;

import org.springframework.stereotype.Service;

import api.main.DTO.FacturaDTO;
import api.main.entity.Factura;
import api.main.repository.FacturaRepository;

@Service()
public class FacturaService extends BaseService<Factura, FacturaDTO>{

	private FacturaRepository facturaRepository;
	
	public FacturaService(FacturaRepository facturaRepository) {
		super(facturaRepository, FacturaDTO.class, Factura.class);
		this.facturaRepository = facturaRepository;
	}
	
}
