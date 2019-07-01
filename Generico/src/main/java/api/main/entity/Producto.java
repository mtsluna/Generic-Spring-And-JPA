package api.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity(name = "api_producto")
public class Producto extends Base{

	@Column(name = "producto_nombre")
	private String nombre;
	
	@Column(name = "producto_precioUnitario")
	private double precioUnitario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}	
	
}
