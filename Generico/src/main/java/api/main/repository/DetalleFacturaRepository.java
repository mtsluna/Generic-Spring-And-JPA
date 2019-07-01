package api.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.main.entity.DetalleFactura;

@Repository()
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer>{

}
