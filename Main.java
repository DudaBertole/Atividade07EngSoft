import java.sql.Connection; 
import java.sql.SQLException; 
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = ConnectionFactory.getConnection();

            Cliente cliente = new Cliente(12345678901L, "Cliente Exemplo", "Rua Exemplo, 123", "123456789", "cliente@exemplo.com");
            Automovel automovel = new Automovel("ABC1234", 123456789L, "1HGBH41JXMN109186", "Preto", 4, 1, 100000L, 150.0);

            LocacaoDAO locacaoDAO = new LocacaoDAO(connection);

            locacaoDAO.salvar(new Locacao(cliente, automovel, Date.valueOf("2023-01-01"), Date.valueOf("2023-01-10"), 500.0));

            long idLocacao = 1;  
            Locacao locacao = locacaoDAO.buscarPorId(idLocacao);

            if (locacao != null) {
                System.out.println("Locação encontrada: ");
                System.out.println(locacao);
            } else {
                System.out.println("Locação não encontrada.");
            }


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

