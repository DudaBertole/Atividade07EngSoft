public class CriarTabelaAutomovel extends CriarTabela {

    @Override
    protected String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS Automovel ("
                + "placa TEXT PRIMARY KEY,"
                + "cor TEXT,"
                + "nroportas INTEGER,"
                + "tipo_combustivel INTEGER,"
                + "quilometragem INTEGER,"
                + "renavam INTEGER,"
                + "chassi TEXT,"
                + "valor_locacao REAL,"
                + "id_modelo INTEGER NOT NULL,"
                + "FOREIGN KEY(id_modelo) REFERENCES modelo(id_modelo)"
                + ");";
    }
}