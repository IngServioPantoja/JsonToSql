package co.com.ap.model;

import java.util.List;

public class Student {

	private String _id;
	private String name;
	private String nombre;
	private List<Puntaje> puntajes;
	private List<Puntaje> scores;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Puntaje> getPuntajes() {
		return puntajes;
	}

	public void setPuntajes(List<Puntaje> puntajes) {
		this.puntajes = puntajes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Puntaje> getScores() {
		return scores;
	}

	public void setScores(List<Puntaje> scores) {
		this.scores = scores;
	}
	
	public String toSQLInsert(){
		String insert = "INSER INTO "+this.getClass().getSimpleName()+" (_id, nombre) Values("+this.get_id()+","+StudentMergerField.getNombre(this)+"); \n"; 
		if(scores!=null){
			for (Puntaje puntaje : scores) {
				puntaje.setStudent(this);
				insert = insert + puntaje.toSQLInsert();
			}
		}
		if(puntajes!=null){
			for (Puntaje puntaje : puntajes) {
				puntaje.setStudent(this);
				insert = insert + puntaje.toSQLInsert();
			}
		}
		return insert;
	}
	
	@Override
	public String toString() {
		return "Student [_id=" + _id + ", name=" + name + ", nombre=" + nombre + ", puntajes=" + puntajes + "]";
	}

}
