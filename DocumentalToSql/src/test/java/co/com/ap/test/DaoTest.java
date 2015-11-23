package co.com.ap.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import co.com.ap.dao.IGenericDao;
import co.com.ap.dao.exception.DaoException;
import co.com.ap.dao.impl.GenericDaoImpl;
import co.com.ap.model.GenericJSon;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DaoTest {

	@SuppressWarnings({ "resource" })
	public static void main(String args[]) throws IOException {

		String cadenaTotal = "";
		String cadena = "";
		FileReader f = new FileReader("C:/Users/ServioAndres/git/JsonToSql/DocumentalToSql/src/test/java/co/com/ap/test/Restaurante.json");
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			cadenaTotal = cadenaTotal + cadena;
		}

		ObjectMapper mapper = new ObjectMapper();
		List<GenericJSon> jsonObjects = mapper.readValue(cadenaTotal, new TypeReference<List<GenericJSon>>() {
		});
		String[] tokens = null;
		for (GenericJSon jsonObject : jsonObjects) {
			tokens = jsonObject.getSQLInsert().split(";", -1);
		}

		IGenericDao genericDao = null;
		try {
			genericDao = new GenericDaoImpl();
			genericDao.insertarRegistros(tokens);
			System.out.println("Migración completada exitosamente");
		} catch (DaoException e) {
			System.err.println("Ha ocurrido un error ejecutando el script: "+e.getMessage());
		}
	}

}
