package api.main.DTO;

import java.util.ArrayList;
import java.util.List;

public class FacturaDTO extends ComprobanteDTO{

	private String tipo;

	private List<DetalleFacturaDTO> detalles = new ArrayList<>();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<DetalleFacturaDTO> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFacturaDTO> detalles) {
		this.detalles = detalles;
	}
	
}
