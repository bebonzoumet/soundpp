import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemPlano {
    public static void main (String[] args) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT plano_de_assinatura_id, fk_administrador, titulo, descricao, valor_cobranca_mensal FROM Plano_de_assinatura"); 
        ResultSet rst = stm.getResultSet();
        if (resultado) {
        	while (rst.next()){
        		Integer id = rst.getInt("plano_de_assinatura_id"); 
                System.out.println(id);
                Integer fkAdm = rst.getInt("fk_administrador"); 
                System.out.println(fkAdm);
                String titulo = rst.getString("titulo");
                System.out.println(titulo);
                String descricao = rst.getString("descricao");
                System.out.println(descricao);
                Double valor = rst.getDouble("valor_cobranca_mensal"); 
                System.out.println(valor);
        	}
        }
        else {
        	System.out.println("A tabela esta vazia");
        }
        connection.close();
        
    }
}
