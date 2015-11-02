package co.com.ap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ap.dao.IGenericDao;
import co.com.ap.dao.exception.DaoException;
import co.com.ap.dao.impl.GenericDaoImpl;
import co.com.ap.model.GenericJSon;

public class DaoTest {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String args[]) throws IOException {

		String cadenaTotal = "";
		String cadena = "";
		FileReader f = new FileReader("B:/archivo/students.json");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			cadenaTotal = cadenaTotal + cadena;
		}

		ObjectMapper mapper = new ObjectMapper();
		List<GenericJSon> jsonObjects = mapper.readValue(cadenaTotal, new TypeReference<List<GenericJSon>>() {
		});
		String completeSQL = "";
		for (GenericJSon jsonObject : jsonObjects) {
			completeSQL = completeSQL + jsonObject.getSQLInsert();
			System.out.println(jsonObject.getSQLInsert());
		}
		
		IGenericDao genericDao = null;
		try {
			genericDao = new GenericDaoImpl();
			genericDao.insertarRegistros(completeSQL);
		} catch (DaoException e) {
			System.err.println("Ha ocurrido un error ejecutando el script: "+e.getMessage());
		}
	}

}
