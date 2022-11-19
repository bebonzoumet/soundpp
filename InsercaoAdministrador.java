import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsercaoAdministrador {
    public static void main (String[] args) throws SQLException{
        Scanner scNome = new Scanner(System.in);
        System.out.println("Digite o nome do administrador: ");
        String nome = scNome.nextLine();

        while(nome.contains(";")){
            System.out.println("Nome Invalido!");
            System.out.println("Digite o nome do administrador: ");
            nome = scNome.nextLine();
        }

        Scanner scCPF = new Scanner(System.in);
        System.out.println("Digite o cpf do administrador: ");
        String cpf = scCPF.nextLine();

        while(cpf.contains(";")){
            System.out.println("CPF Invalido!");
            System.out.println("Digite o CPF do administrador: ");
            cpf = scCPF.nextLine();
        }

        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement(); 
        stm.execute(("insert into Administrador (nome, cpf) values (" + "'" + nome + "'" +  "," + "'" + cpf + "'" + ");") , Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()){
            Integer id = rst.getInt(1); 
            System.out.println(id);
        }
        connection.close();
        scNome.close();
        scCPF.close();
    }
}
