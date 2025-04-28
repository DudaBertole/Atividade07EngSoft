public class CriarTabelaCliente extends CriarTabela {

    @Override
    protected String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS Cliente ("
                + "cpf_cli INTEGER PRIMARY KEY,"
                + "nom_cli TEXT,"
                + "end_cli TEXT,"
                + "tel_cli TEXT,"
                + "email_cli TEXT"
                + ");";
    }
}