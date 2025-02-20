package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = sc.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		//String excluirSQL = "DELETE FROM pessoas WHERE codigo = ?";
		String excluirSQL = "DELETE FROM pessoas WHERE codigo >= ?";
		
		PreparedStatement stmt = conexao.prepareStatement(excluirSQL);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if (contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nada feito!");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		conexao.close();
		sc.close();
		
	}
}
