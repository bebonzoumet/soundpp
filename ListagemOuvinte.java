import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemOuvinte {
    public static void main (String[] args) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT ouvinte_id, nome, cpf FROM Ouvinte"); 
        ResultSet rst = stm.getResultSet();
        if (resultado) {
        	while (rst.next()){
	            Integer id = rst.getInt("ouvinte_id"); 
				System.out.println(id);
				String nome = rst.getString("nome"); 
				System.out.println(nome);
				String cpf = rst.getString("cpf");
				System.out.println(cpf);
        	}
        }
        else {
        	System.out.println("A tabela está vazia");
        }
        connection.close();
    }
}