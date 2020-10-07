import java.sql.*;
import java.util.Scanner;

public class DeletarFuncionario {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Codigo do funcionario a deletar: ");
		String codigo = entrada.nextLine();
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:empresa.db");
			Statement stmt = con.createStatement();
			String query = "delete from funcionario where func_id='" + codigo + "'";
			stmt.executeUpdate(query);
			stmt.close();
			con.close();

		} catch (SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		} catch (java.lang.ClassNotFoundException e) {
			System.err.println("ClassNotFoundException: " + e.getMessage());
		}
		entrada.close();
	}
}