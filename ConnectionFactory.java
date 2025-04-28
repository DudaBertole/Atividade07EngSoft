import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:sqlite:seu_banco_de_dados.db"; // caminho do banco de dados

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}