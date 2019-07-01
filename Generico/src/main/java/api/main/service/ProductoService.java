package api.main.service;

import org.springframework.stereotype.Service;

import api.main.DTO.ProductoDTO;
import api.main.entity.Producto;
import api.main.repository.ProductoRepository;

@Service()
public class ProductoService extends BaseService<Producto, ProductoDTO>{

	private ProductoRepository productoRepository;
	
	public ProductoService(ProductoRepository productoRepository) {		
		super(productoRepository, ProductoDTO.class, Producto.class);
		this.productoRepository = productoRepository;
	}
	
}
