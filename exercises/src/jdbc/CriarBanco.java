package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "Myarroz@1";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS java_course");
		//stmt.execute("DROP DATABASE IF EXISTS java_course");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}
}
