package api.main.DTO;

import java.util.ArrayList;
import java.util.List;

public class ComprobanteDTO extends BaseDTO{

	private int numero;
	
	private String fecha;
	
	private List<PersonaDTO> personas = new ArrayList<>();
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public List<PersonaDTO> getPersonas() {
		return personas;
	}

	public void setPersonas(List<PersonaDTO> personas) {
		this.personas = personas;
	}
	
}
