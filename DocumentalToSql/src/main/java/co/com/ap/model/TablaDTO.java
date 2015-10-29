package co.com.ap.model;

import java.io.Serializable;
import java.util.List;

public class TablaDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	private List<CampoDTO> campos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<CampoDTO> getCampos() {
		return campos;
	}
	public void setCampos(List<CampoDTO> campos) {
		this.campos = campos;
	}
	
}
