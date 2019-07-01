package api.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.main.entity.Vendedor;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Integer>{

}
