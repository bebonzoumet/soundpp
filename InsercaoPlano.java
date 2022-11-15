import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsercaoPlano {
    public static void main (String[] args) throws SQLException{
        Scanner scAdm = new Scanner(System.in);
        System.out.println("Digite o ID do administrador: ");
        int adm = scAdm.nextInt();

        Scanner scTitulo = new Scanner(System.in);
        System.out.println("Digite o titulo do plano: ");
        String titulo = scTitulo.nextLine();

        if(titulo.contains(";")){
            System.out.println("titulo Invalido!");
            System.out.println("Digite o titulo do plano: ");
            titulo = scTitulo.nextLine();
        }

        Scanner scDesc = new Scanner(System.in);
        System.out.println("Digite a descricao do plano: ");
        String desc = scDesc.nextLine();

        if(desc.contains(";")){
            System.out.println("Descricao Invalida!");
            System.out.println("Digite a descricao do plano: ");
            desc = scDesc.nextLine();
        }

        Scanner scValor = new Scanner(System.in);
        System.out.println("Digite o valor do plano: ");
        double valor = scAdm.nextDouble();

        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement(); 
        stm.execute(("insert into Plano_de_assinatura (fk_administrador, titulo, descricao, valor_cobranca_mensal) values (" + "'" + adm + "'" +  "," + "'" + titulo + "'" + "," + "'" + desc + "'" + "," + "'" + valor + "'" +");") , Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()){
            Integer id = rst.getInt(1); 
            System.out.println(id);
        }
        connection.close();
        }
}
