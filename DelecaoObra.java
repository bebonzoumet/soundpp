import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DelecaoObra {
    public static void main (String[] args) throws SQLException{
        Scanner scID = new Scanner(System.in);
        System.out.println("Digite o id da obra: ");
        int id = scID.nextInt();

        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement();
        stm.execute("DELETE FROM Obra WHERE obra_id = " + id + ";");
        Integer linhasModificadas = stm.getUpdateCount(); System.out.println("Quantidade de Linhas Modificadas " + linhasModificadas); connection.close();
        }
}
