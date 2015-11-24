package co.com.ap.model;

public class StudentMergerField {
	
	public static String getNombre(Student student){
		String nombre = "";
		if(student.getName()!=null && !student.getName().trim().equals("")){
			nombre = nombre +student.getName();			
		}else if(student.getNombre()!=null && !student.getNombre().trim().equals("")){
			nombre = nombre +student.getNombre();			
		}
		return nombre;
	}
	
}
