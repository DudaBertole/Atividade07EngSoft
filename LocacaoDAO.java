import java.sql.*;

public class LocacaoDAO extends BaseDAO {

    public LocacaoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Locacao locacao = (Locacao) objeto;
        String sql = "INSERT INTO locacoes (cliente_cpf, automovel_id, data_inicio, data_fim, valor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, locacao.getCliente().getCpf());
            stmt.setLong(2, locacao.getAutomovel().getId());
            stmt.setDate(3, locacao.getDataInicio());
            stmt.setDate(4, locacao.getDataFim());
            stmt.setDouble(5, locacao.getValor());
            stmt.executeUpdate();
        }
    }

    @Override
    public Locacao buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM locacoes WHERE id_locacao = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Obtendo Cliente e Automovel, não o id diretamente
                Cliente cliente = new ClienteDAO(connection).buscarPorId(rs.getLong("cliente_cpf"));
                Automovel automovel = new AutomovelDAO(connection).buscarPorId(rs.getLong("automovel_id"));
                
                // Criação correta da Locacao
                return new Locacao(
                    cliente,           // Passa o objeto Cliente
                    automovel,         // Passa o objeto Automovel
                    rs.getDate("data_inicio"), // Passa Date diretamente
                    rs.getDate("data_fim"),    // Passa Date diretamente
                    rs.getDouble("valor")      // Passa o valor diretamente
                );
            }
        }
        return null;
    }


    @Override
    public void atualizar(Object objeto) throws SQLException {
        Locacao locacao = (Locacao) objeto;
        String sql = "UPDATE locacoes SET cliente_cpf = ?, automovel_id = ?, data_inicio = ?, data_fim = ?, valor = ? WHERE id_locacao = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, locacao.getCliente().getCpf());
            stmt.setLong(2, locacao.getAutomovel().getId());
            stmt.setDate(3, locacao.getDataInicio());
            stmt.setDate(4, locacao.getDataFim());
            stmt.setDouble(5, locacao.getValor());
            stmt.setLong(6, locacao.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM locacoes WHERE id_locacao = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
