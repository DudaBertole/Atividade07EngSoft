public class CriarTabelaModelo extends CriarTabela {
    @Override
    public String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS modelo (" +
               "id_modelo INTEGER PRIMARY KEY AUTOINCREMENT," +
               "descricao TEXT NOT NULL," +
               "id_marca INTEGER NOT NULL," +
               "FOREIGN KEY(id_marca) REFERENCES marca(id_marca)" +
               ")";
    }
}