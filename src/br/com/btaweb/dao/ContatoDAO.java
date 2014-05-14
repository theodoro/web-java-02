package br.com.btaweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.btaweb.entidade.Contato;
import br.com.btaweb.jdbc.ConexaoJDBC;

public class ContatoDAO {
	
	private Connection connection;
	
	public ContatoDAO(){
		
		this.connection = new ConexaoJDBC().getConnection();
	}
	
	public void adicionar(Contato contato){
		
		try{
			
			String sql = "insert into contatos (nome, email, endereco, dataNascimento) values (?, ?, ?, ?)";
			
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}
