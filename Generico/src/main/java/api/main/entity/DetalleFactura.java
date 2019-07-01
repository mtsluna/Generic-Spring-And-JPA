package api.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "api_detallefactura")
public class DetalleFactura extends Base{

	@Column(name = "detallefactura_cantidad")
	private int cantidad;
	
	@ManyToOne()
	@JoinColumn(name = "Producto.id")
	private Producto producto;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
