package api.main.service;

import org.springframework.stereotype.Service;

import api.main.DTO.DetalleFacturaDTO;
import api.main.entity.DetalleFactura;
import api.main.repository.DetalleFacturaRepository;

@Service()
public class DetalleFacturaService extends BaseService<DetalleFactura, DetalleFacturaDTO>{

	private DetalleFacturaRepository detalleFacturaRepository;
	
	public DetalleFacturaService(DetalleFacturaRepository detalleFacturaRepository) {
		super(detalleFacturaRepository, DetalleFacturaDTO.class, DetalleFactura.class);
		this.detalleFacturaRepository = detalleFacturaRepository;		
	}
	
}
