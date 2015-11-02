package co.com.ap.model;

public class PuntajeMergerField {
	
	public static String getPuntaje(Puntaje puntaje){
		String value = "";
		if(puntaje.getPuntaje()!=null && !puntaje.getPuntaje().trim().equals("")){
			value = value +puntaje.getPuntaje();			
		}else if(puntaje.getScore() !=null && !puntaje.getScore().trim().equals("")){
			value = value +puntaje.getScore();			
		}
		return value;
	}
	
}
