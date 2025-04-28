import java.sql.*;

public class ClienteDAO extends BaseDAO {
    
    public ClienteDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void salvar(Object objeto) throws SQLException {
        Cliente cliente = (Cliente) objeto;
        String sql = "INSERT INTO clientes (cpf, nome, endereco, telefone, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEmail());
            stmt.executeUpdate();
        }
    }

    @Override
    public Cliente buscarPorId(long id) throws SQLException {
        String sql = "SELECT * FROM clientes WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                    rs.getLong("cpf"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );
            }
        }
        return null;
    }

    @Override
    public void atualizar(Object objeto) throws SQLException {
        Cliente cliente = (Cliente) objeto;
        String sql = "UPDATE clientes SET nome = ?, endereco = ?, telefone = ?, email = ? WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setLong(5, cliente.getCpf());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluir(long id) throws SQLException {
        String sql = "DELETE FROM clientes WHERE cpf = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        }
    }
}
