package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoas {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		System.out.println("Informe o nome: ");
		String valor = sc.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, valor);
		stmt.setInt(3, 101);
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();

		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ===> " + p.getNome());
		}
		
		
		sc.close();
		conexao.close();
		stmt.close();
	}
}
