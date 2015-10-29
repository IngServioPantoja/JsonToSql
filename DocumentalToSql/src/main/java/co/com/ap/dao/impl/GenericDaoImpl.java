package co.com.ap.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.com.ap.core.Conexion;
import co.com.ap.dao.IGenericDao;
import co.com.ap.dao.exception.DaoException;
import co.com.ap.model.CampoDTO;
import co.com.ap.model.TablaDTO;

public class GenericDaoImpl implements IGenericDao, Serializable {

	private static final long serialVersionUID = 8497018053322561394L;
	
	private Connection userConn;
	
	public GenericDaoImpl(){
		
	}
	
	public GenericDaoImpl(Connection conn){
		this.userConn = conn;
	}
	
	public void crearTabla(TablaDTO tabla) throws DaoException{
		Connection conn = null;
		PreparedStatement stmt = null;
		try {
			conn = (this.userConn!=null) ? this.userConn : Conexion.getConnection();
			String sql_create_table = "";
			String header = "CREATE TABLE "+tabla.getNombre()+"(";
			String body = "";
			if(tabla.getNombre()!=null && tabla.getCampos()!=null){
				for (CampoDTO campo : tabla.getCampos()) {
					String campoTabla = campo.getNombre()+" "+campo.getTipoDato().toString();
					if(body.equals("")){
						body = body+" "+campoTabla;
						
					}else {
						body = body+", "+campoTabla;
					}
				}
				String footer = ");";
				sql_create_table = header+body+footer;
				stmt = conn.prepareStatement(sql_create_table);
	
				System.out.println("Ejecutando query: "+sql_create_table);
				int rows = stmt.executeUpdate();
				System.out.println(rows);
			}
		} catch (SQLException e) {
			throw new DaoException("Ha ocurrido un error al crear la tabla",e);
		}
		finally{
			Conexion.close(stmt);
			if(this.userConn == null)
				Conexion.close(conn);
		}
	}
	
}
