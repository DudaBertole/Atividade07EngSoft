public class CriarTabelaLocacao extends CriarTabela {

    @Override
    public String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS locacao ("
                + "id_locacao INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "data_inicio DATE,"
                + "data_fim DATE,"
                + "hora_locacao TIME,"
                + "dt_devolucao DATE,"
                + "hora_devolucao TIME,"
                + "quilometragem INTEGER,"
                + "valor_caucao REAL,"
                + "valor REAL,"
                + "devolvido INTEGER,"
                + "cliente_cpf INTEGER NOT NULL,"
                + "automovel_id INTEGER NOT NULL,"
                + "placa_automovel TEXT NOT NULL,"
                + "FOREIGN KEY(cliente_cpf) REFERENCES cliente(cliente_cpf),"
                + "FOREIGN KEY(automovel_id) REFERENCES automovel(automovel_id)"
                + ");";
    }
}