import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemProdutor {
    public static void main (String[] args) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT produtor_id, nome, cpf FROM Produtor"); 
        ResultSet rst = stm.getResultSet();
        if (resultado) {
        	while (rst.next()){
	            Integer id = rst.getInt("produtor_id"); 
				System.out.println(id);
				String nome = rst.getString("nome"); 
				System.out.println(nome);
				String cpf = rst.getString("cpf");
				System.out.println(cpf);
        	}
        }
        else {
        	System.out.println("A tabela esta vazia");
        }
        connection.close();
    }
}