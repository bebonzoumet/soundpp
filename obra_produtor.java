import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class obra_produtor {

    public void ObraProdutor(int produtorId, int obraId) throws SQLException{
        CriaConexao criaConexao = new CriaConexao();
        Connection connection = criaConexao.recuperarConexao();
        Statement stm = connection.createStatement();
        stm.execute(("insert into produtor_obra (fk_produtor, fk_obra) values (" + produtorId + "," + obraId + ");") , Statement.RETURN_GENERATED_KEYS);
        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()){
            Integer id = rst.getInt(1);
            System.out.println(id);
        }
        connection.close();
    }

}