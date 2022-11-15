import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriaConexao {

    public Connection recuperarConexao() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/soundpp?useTimezone =true&serverTimezone=UTC”, “root”, “mysqlroot”");
        return connection; }
    
}
