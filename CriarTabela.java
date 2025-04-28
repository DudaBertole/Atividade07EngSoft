import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CriarTabela {

    protected String url = "jdbc:sqlite:bdconcessionaria.db";

    protected abstract String getCreateStatement();

    public void criarTabela() {
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute(getCreateStatement());
                System.out.println("Tabela criada: " + this.getClass().getSimpleName());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

