package co.com.ap.model;

import java.io.Serializable;

public class CampoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private TipoDato tipoDato;
	
	public CampoDTO() {
		super();
	}
	
	public CampoDTO(String nombre, TipoDato tipoDato) {
		this();
		this.nombre = nombre;
		this.tipoDato = tipoDato;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoDato getTipoDato() {
		return tipoDato;
	}
	public void setTipoDato(TipoDato tipoDato) {
		this.tipoDato = tipoDato;
	}
	
}
