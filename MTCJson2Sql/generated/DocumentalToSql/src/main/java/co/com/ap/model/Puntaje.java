package co.com.ap.model;

public class Puntaje {
	
	private Long id;
	private String type;
	private String puntaje;
	private String score;
	private Student student;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(String puntaje) {
		this.puntaje = puntaje;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	public String toSQLInsert(){
	
		String insert = "INSER INTO "+this.getClass().getSimpleName()+" (";
		String columns = "";
		if(id!=null){
			columns = columns + "id,";			
		}
		columns = "type, puntaje, id_estudent) Values(";
		if(id!=null){
			insert = insert + columns + id+",";
		}
		insert = insert + this.getType()+","+PuntajeMergerField.getPuntaje(this)+","; 
		insert = insert + this.student.get_id()+"); \n";
		return insert;
	}
	
	@Override
	public String toString() {
		return "Puntaje [type=" + type + ", puntaje=" + puntaje + ", score=" + score + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
