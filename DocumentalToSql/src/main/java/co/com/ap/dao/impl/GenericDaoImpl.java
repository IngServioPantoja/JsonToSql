package co.com.ap.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.com.ap.core.Conexion;
import co.com.ap.dao.IGenericDao;
import co.com.ap.dao.exception.DaoException;

public class GenericDaoImpl implements IGenericDao, Serializable {

	private static final long serialVersionUID = 8497018053322561394L;

	private Connection userConn;

	public GenericDaoImpl() {

	}

	public GenericDaoImpl(Connection conn) {
		this.userConn = conn;
	}

	public void insertarRegistros(String sql) throws DaoException {
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
			stmt = conn.prepareStatement(sql);
			int rows = stmt.executeUpdate();
			System.out.println(rows);
		} catch (SQLException e) {
			throw new DaoException("Ha ocurrido un error al insertar lso registros: "+e.getMessage(), e);
		} finally {
			Conexion.close(stmt);
			if (this.userConn == null)
				Conexion.close(conn);
		}
	}

}
