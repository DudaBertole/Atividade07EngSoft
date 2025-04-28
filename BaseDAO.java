import java.sql.*;

public abstract class BaseDAO {
    protected Connection connection;

    public BaseDAO(Connection connection) {
        this.connection = connection;
    }


    protected void abrirConexao() throws SQLException {
        if (connection == null || connection.isClosed()) {

        }
    }


    protected void fecharConexao() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }


    public abstract void salvar(Object objeto) throws SQLException;

    public abstract Object buscarPorId(long id) throws SQLException;

    public abstract void atualizar(Object objeto) throws SQLException;

    public abstract void excluir(long id) throws SQLException;
}
