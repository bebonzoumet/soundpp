import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DelecaoAdministrador {
    public static void main (String[] args) throws SQLException{
        Scanner scID = new Scanner(System.in);
        System.out.println("Digite o id do administrador: ");
        int id = scID.nextInt();
        scID.close();
        
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement();
        stm.execute("DELETE FROM Administrador WHERE administrador_id = " + id + ";");
        Integer linhasModificadas = stm.getUpdateCount(); System.out.println("Quantidade de Linhas Modificadas " + linhasModificadas); connection.close();
        }
}
