import java.sql.*;
import java.util.Scanner;

public class InserirFuncionario {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome do funcionario a inserir  : ");
        String nome = entrada.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        String salario = entrada.nextLine();
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:empresa.db");
            Statement stmt = con.createStatement();
            String query = "insert into funcionario (nome, salario) values ('" + nome + "', '" + salario + "')";
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