import java.sql.*;

public class ListarDependentes {
    public static void main(String args[]) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:empresa.db");
            Statement stmt = con.createStatement();
            String query = "SELECT f.func_id, f.nome as func_nome, d.nome as dep_nome, d.idade "
                    + "FROM funcionario f, dependente d WHERE f.func_id = d.func_id";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int func_id = rs.getInt("func_id");
                String func_nome = rs.getString("func_nome");
                String nome = rs.getString("dep_nome");
                int idade = rs.getInt("idade");
                System.out.println(func_id + " - " + func_nome + " - " + nome + " - " + idade);
            }
            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } catch (java.lang.ClassNotFoundException e) {
            System.err.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}