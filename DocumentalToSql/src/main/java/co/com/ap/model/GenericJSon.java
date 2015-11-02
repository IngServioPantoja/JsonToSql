package co.com.ap.model;

public class GenericJSon {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String getSQLInsert(){
		if(student!=null){
			return student.toSQLInsert();
		}
		return null;
	}
		
}
