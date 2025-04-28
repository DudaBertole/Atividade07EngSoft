import java.sql.*;

public class AutomovelDAO extends BaseDAO {

    public AutomovelDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Automovel automovel = (Automovel) objeto;
        String sql = "INSERT INTO automoveis (placa, renavam, chassi, cor, numero_portas, tipo_combustivel, quilometragem, valor_locacao, modelo_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, automovel.getPlaca()); 
            stmt.setLong(2, automovel.getRenavam());  
            stmt.setString(3, automovel.getChassi());  
            stmt.setString(4, automovel.getCor());  
            stmt.setInt(5, automovel.getNumeroPortas());  
            stmt.setInt(6, automovel.getTipoCombustivel());  
            stmt.setLong(7, automovel.getQuilometragem());  
            stmt.setDouble(8, automovel.getValorLocacao());  
            stmt.setLong(9, automovel.getModelo().getId()); 
            stmt.executeUpdate();
        }
    }

    @Override
    public Automovel buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM automoveis WHERE id_automovel = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {

                Modelo modelo = new ModeloDAO(connection).buscarPorId(rs.getLong("modelo_id"));
                return new Automovel(
                    rs.getString("placa"),
                    rs.getLong("renavam"),
                    rs.getString("chassi"),
                    rs.getString("cor"),
                    rs.getInt("numero_portas"),
                    rs.getInt("tipo_combustivel"),
                    rs.getLong("quilometragem"),
                    rs.getDouble("valor_locacao")
                );
            }
        }
        return null;
    }

    @Override
    public void atualizar(Object objeto) throws SQLException {
        Automovel automovel = (Automovel) objeto;
        String sql = "UPDATE automoveis SET placa = ?, renavam = ?, chassi = ?, cor = ?, numero_portas = ?, tipo_combustivel = ?, quilometragem = ?, valor_locacao = ?, modelo_id = ? WHERE id_automovel = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, automovel.getPlaca());
            stmt.setLong(2, automovel.getRenavam());
            stmt.setString(3, automovel.getChassi());
            stmt.setString(4, automovel.getCor());
            stmt.setInt(5, automovel.getNumeroPortas());
            stmt.setInt(6, automovel.getTipoCombustivel());
            stmt.setLong(7, automovel.getQuilometragem());
            stmt.setDouble(8, automovel.getValorLocacao());
            stmt.setLong(9, automovel.getModelo().getId());
            stmt.setLong(10, automovel.getId());  
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM automoveis WHERE id_automovel = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
