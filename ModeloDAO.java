import java.sql.*;

public class ModeloDAO extends BaseDAO {

    public ModeloDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Modelo modelo = (Modelo) objeto;
        String sql = "INSERT INTO modelos (descricao, marca_id) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, modelo.getDescricao());
            stmt.setLong(2, modelo.getMarca().getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public Modelo buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM modelos WHERE id_modelo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Modelo(rs.getString("descricao"));
            }
        }
        return null;
    }

    @Override
    public void atualizar(Object objeto) throws SQLException {
        Modelo modelo = (Modelo) objeto;
        String sql = "UPDATE modelos SET descricao = ?, marca_id = ? WHERE id_modelo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, modelo.getDescricao());
            stmt.setLong(2, modelo.getMarca().getId());
            stmt.setLong(3, modelo.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM modelos WHERE id_modelo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
