package co.com.ap.dao;

import co.com.ap.dao.exception.DaoException;
import co.com.ap.model.TablaDTO;

public interface IGenericDao {
	
	void crearTabla(TablaDTO tabla) throws DaoException;
	
}
