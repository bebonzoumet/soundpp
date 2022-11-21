import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListagemPlaylist {

    public static void main(String[] args) throws SQLException {
        listagemPlaylist();
    }
    public static void listagemPlaylist() throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao(); 
        Statement stm = connection.createStatement();
        boolean resultado = stm.execute("SELECT playlist_id, fk_ouvinte, nome, privacidade FROM Playlist");
        ResultSet rst = stm.getResultSet();

        if (rst.next() == true) {
        	while (rst.next()){
                String playid = rst.getString("playlist_id");
                System.out.println(playid);
                Integer chaveouvinte = rst.getInt("fk_ouvinte");
                System.out.println(chaveouvinte);
                String nome = rst.getString("nome");
                System.out.println(nome);
                String priv = rst.getString("privacidade");
                System.out.println(priv);

        	}
        }
        else {
        	System.out.println("A tabela esta vazia");
        }
        connection.close();
    }
}