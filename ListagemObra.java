import java.sql.Statement;
import java.sql.Time;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemObra {
    public static void main (String[] args) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT obra_id, titulo,letra,data_lancamento, censura, duracao, categoria  FROM Obra");
        ResultSet rst = stm.getResultSet();
        if (resultado) {
        	while (rst.next()){
                Integer id = rst.getInt("obra_id");
                System.out.println(id);
                String titulo = rst.getString("titulo");
                System.out.println(titulo);
                String letra = rst.getString("letra");
                System.out.println(letra);
                Date lancamento = rst.getDate("data_lancamento");
                System.out.println(lancamento);
                Boolean censura = rst.getBoolean("censura");
                System.out.println(censura);
                Time duracao = rst.getTime("duracao");
                System.out.println(duracao);
                String categoria = rst.getString("categoria");
                System.out.println(categoria);
        	}
        }
        else {
        	System.out.println("A tabela esta vazia");
        }
        connection.close();
    }
}
