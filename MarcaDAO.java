import java.sql.*;

public class MarcaDAO extends BaseDAO {

    public MarcaDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Marca marca = (Marca) objeto;
        String sql = "INSERT INTO marcas (descricao) VALUES (?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca.getDescricao());
            stmt.executeUpdate();
        }
    }

    @Override
    public Marca buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM marcas WHERE id_marca = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Marca(rs.getString("descricao"));
            }
        }
        return null;
    }

    @Override
    public void atualizar(Object objeto) throws SQLException {
        Marca marca = (Marca) objeto;
        String sql = "UPDATE marcas SET descricao = ? WHERE id_marca = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca.getDescricao());
            stmt.setLong(2, marca.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM marcas WHERE id_marca = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
