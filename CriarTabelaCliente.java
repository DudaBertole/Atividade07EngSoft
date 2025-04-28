public class CriarTabelaCliente extends CriarTabela {

    @Override
    protected String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS cliente ("
                + "cliente_cpf INTEGER PRIMARY KEY,"
                + "nom_cli TEXT,"
                + "end_cli TEXT,"
                + "tel_cli TEXT,"
                + "email_cli TEXT"
                + ");";
    }
}