import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsercaoPlaylist{

    public static void main(String[] args) throws SQLException {

        ListagemObra lo = new ListagemObra();
        lo.listagemObra();

        Scanner scOuvinteId = new Scanner(System.in);
		System.out.println("Digite o id do ouvinte: ");
		Integer ouvinte_id = scOuvinteId.nextInt();

        Scanner scNome = new Scanner(System.in);
		System.out.println("Digite o nome da playlist:");
		String nome = scNome.nextLine();

        while(nome.contains(";")) {
			System.out.println("Nome inválido");
			System.out.println("Digite o nome da playlist:");
			nome = scNome.nextLine();
		}

        Scanner scPrivacidade = new Scanner(System.in);
		System.out.println("Digite o tipo de privacidade da playlist (1- Pública / 2- Privada): ");
		Integer privacidade = scPrivacidade.nextInt();

        Scanner scNumObras = new Scanner(System.in);
		System.out.println("Digite quantas obras deseja inserir: ");
		Integer numobras = scNumObras.nextInt();

		CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement();
        stm.execute(("INSERT INTO playlist (fk_ouvinte, nome, privacidade) VALUES ("+"'"+ouvinte_id+"'"+","+"'"+nome+"'"+","+"'"+privacidade+"'"+");"), Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();

        Scanner scIdPlaylist = new Scanner(System.in);

        while (rst.next()) {
            Integer id = rst.getInt(1);
            for(int i=0; i< numobras; i++){
                System.out.println("Digite o id da playlist: ");
                int playlist_id = scIdPlaylist.nextInt();
                playlist_obra x = new playlist_obra();
                x.PlayObra(playlist_id, id);
            }
            System.out.println(id);
        }





        connection.close();
        scNome.close();
        scPrivacidade.close();
    }
}