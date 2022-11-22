import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsercaoAutor {
    public static void main (String[] args) throws SQLException{
        Scanner scNome = new Scanner(System.in);
        System.out.println("Digite o nome do autor: ");
        String nome = scNome.nextLine();

        while(nome.contains(";")){
            System.out.println("Nome Invalido!");
            System.out.println("Digite o nome do autor: ");
            nome = scNome.nextLine();
        }

        Scanner scDescricao = new Scanner(System.in);
        System.out.println("Digite uma descrição para o autor: ");
        String descricao = scDescricao.nextLine();

        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement(); 
        stm.execute(("insert into Autor (nome, descricao) values (" + "'" + nome + "'" +  "," + "'" + descricao + "'" + ");") , Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()){
            Integer id = rst.getInt(1); 
            System.out.println(id);
        }
        connection.close();
        scNome.close();
        scDescricao.close();
    }
}