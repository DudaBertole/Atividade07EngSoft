public class CriarTabelaLocacao extends CriarTabela {

    @Override
    public String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS locacao ("
                + "id_locacao INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "dt_locacao DATE,"
                + "hora_locacao TIME,"
                + "dt_devolucao DATE,"
                + "hora_devolucao TIME,"
                + "quilometragem INTEGER,"
                + "valor_caucao REAL,"
                + "valor_locacao REAL,"
                + "devolvido INTEGER,"
                + "cpf_cli INTEGER NOT NULL,"
                + "placa_automovel TEXT NOT NULL,"
                + "FOREIGN KEY(cpf_cli) REFERENCES cliente(cpf_cli),"
                + "FOREIGN KEY(placa_automovel) REFERENCES automovel(placa)"
                + ");";
    }
}