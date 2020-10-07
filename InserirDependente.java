import java.sql.*;
import java.util.Scanner;

public class InserirDependente {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Id do funcionário__: ");
        String func_id = entrada.nextLine();
        System.out.print("Nome do Dependente_: ");
        String nome = entrada.nextLine();
        System.out.print("Idade do Dependente: ");
        String idade = entrada.nextLine();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:empresa.db");
            Statement stmt = con.createStatement();
            String query = "insert into dependente (func_id, nome, idade) values ('" + func_id + "', '" + nome + "', '" + idade + "')";
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
