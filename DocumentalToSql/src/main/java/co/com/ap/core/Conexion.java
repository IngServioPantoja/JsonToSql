package co.com.ap.core;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static String JDBC_URL = "jdbc:mysql://localhost/automatizacion";
	private static String JDBC_USER = "desarrollo";
	private static String JDBC_PASS = "desarrollo";
	private static Driver driver = null;
	public static synchronized Connection getConnection() throws SQLException{
		if(driver == null){
				@SuppressWarnings("rawtypes")
				Class jdbcDriverClass = null;
				try {
					jdbcDriverClass = Class.forName(JDBC_DRIVER);
					driver = (Driver) jdbcDriverClass.newInstance();
					DriverManager.registerDriver(driver);
				} catch (InstantiationException e) {
					System.out.println("Problemas cargando driver "+e);
				} catch (IllegalAccessException e) {
					System.out.println("Problemas cargando driver "+e);
				}catch (ClassNotFoundException e) {
					System.out.println("Problemas cargando driver "+e);
				}
		}
		return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);
	}

	public static void close(ResultSet rs){
		try {
			if(rs != null) rs.close();
		} catch (Exception e) {
			System.out.println("Error close");
		}
	}
	public static void close(PreparedStatement stmt){
		try {
			if(stmt != null) stmt.close();
		} catch (Exception e) {
			System.out.println("Error close");
		}
	}
	public static void close(Connection conn){
		try {
			if(conn != null) conn.close();
		} catch (Exception e) {
			System.out.println("Error close");
		}
	}
	
}
