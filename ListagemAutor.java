import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemAutor {
    public static void main (String[] args) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT autor_id, nome, descricao FROM Autor"); 
        ResultSet rst = stm.getResultSet();
        if (resultado) {
        	while (rst.next()){
	            Integer id = rst.getInt("autor_id"); 
				System.out.println(id);
				String nome = rst.getString("nome"); 
				System.out.println(nome);
				String cpf = rst.getString("descricao");
				System.out.println(descricao);
        	}
        }
        else {
        	System.out.println("A tabela esta vazia");
        }
        connection.close();
    }
}