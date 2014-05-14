package br.com.btaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
	
	private static final String url = "jdbc:postgresql://localhost:5432/db";
	private static final String user = "postgres";
	private static final String senha = "qwe123";
	
	
	public Connection getConnection(){
		
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return DriverManager.getConnection(url, user, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
