import java.sql.*;

public class ListarFuncionarios {
    public static void main(String args[]) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:empresa.db");
            Statement stmt = con.createStatement();
            String query = "select * from funcionario";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int func_id = rs.getInt("func_id");
                String nome = rs.getString("nome");
                float salario = rs.getFloat("salario");
                System.out.println(func_id + ", " + nome + ", " + salario);
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