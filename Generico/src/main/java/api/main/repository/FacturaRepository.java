package api.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.main.entity.Factura;

@Repository()
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
