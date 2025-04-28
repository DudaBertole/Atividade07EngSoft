import java.sql.*;

public class LocacaoDAO extends BaseDAO {

    public LocacaoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Locacao locacao = (Locacao) objeto;
        String sql = "INSERT INTO locacao (data_inicio, data_fim, hora_locacao, dt_devolucao, hora_devolucao, quilometragem, valor_caucao, valor, devolvido, cliente_cpf, automovel_id, placa_automovel) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, locacao.getDataInicio());
            stmt.setDate(2, locacao.getDataFim());
            stmt.setTime(3, locacao.getHoraLocacao());
            stmt.setDate(4, locacao.getDtDevolucao());
            stmt.setTime(5, locacao.getHoraDevolucao());
            stmt.setInt(6, locacao.getQuilometragem());
            stmt.setDouble(7, locacao.getValorCaucao());
            stmt.setDouble(8, locacao.getValor());
            stmt.setInt(9, locacao.getDevolvido());
            stmt.setLong(10, locacao.getClienteCpf());
            stmt.setLong(11, locacao.getAutomovelId());
            stmt.setString(12, locacao.getPlacaAutomovel());

            stmt.executeUpdate();
        }
    }

    @Override
    public Object buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM locacao WHERE id_locacao = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Locacao(
                        rs.getLong("id_locacao"),
                        rs.getDate("data_inicio"),
                        rs.getDate("data_fim"),
                        rs.getTime("hora_locacao"),
                        rs.getDate("dt_devolucao"),
                        rs.getTime("hora_devolucao"),
                        rs.getInt("quilometragem"),
                        rs.getDouble("valor_caucao"),
                        rs.getDouble("valor"),
                        rs.getInt("devolvido"),
                        rs.getLong("cliente_cpf"),
                        rs.getLong("automovel_id"),
                        rs.getString("placa_automovel")
                );
            }
        }
        return null;
    }

    @Override
    public void atualizar(Object objeto) throws SQLException {
        Locacao locacao = (Locacao) objeto;
        String sql = "UPDATE locacao SET "
                + "data_inicio = ?, "
                + "data_fim = ?, "
                + "hora_locacao = ?, "
                + "dt_devolucao = ?, "
                + "hora_devolucao = ?, "
                + "quilometragem = ?, "
                + "valor_caucao = ?, "
                + "valor = ?, "
                + "devolvido = ?, "
                + "cliente_cpf = ?, "
                + "automovel_id = ?, "
                + "placa_automovel = ? "
                + "WHERE id_locacao = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setDate(1, locacao.getDataInicio());
            stmt.setDate(2, locacao.getDataFim());
            stmt.setTime(3, locacao.getHoraLocacao());
            stmt.setDate(4, locacao.getDtDevolucao());
            stmt.setTime(5, locacao.getHoraDevolucao());
            stmt.setInt(6, locacao.getQuilometragem());
            stmt.setDouble(7, locacao.getValorCaucao());
            stmt.setDouble(8, locacao.getValor());
            stmt.setInt(9, locacao.getDevolvido());
            stmt.setLong(10, locacao.getClienteCpf());
            stmt.setLong(11, locacao.getAutomovelId());
            stmt.setString(12, locacao.getPlacaAutomovel());
            stmt.setLong(13, locacao.getIdLocacao());

            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM locacao WHERE id_locacao = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
