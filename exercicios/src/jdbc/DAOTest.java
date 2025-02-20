package jdbc;

public class DAOTest {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "Dark Balter the Terrible");
		dao.incluir(sql, "Celtic Guard of Noble Arms");
		dao.incluir(sql, "Red-Eyes Black Dragon");
	}
}
