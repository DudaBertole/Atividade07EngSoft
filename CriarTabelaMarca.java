public class CriarTabelaMarca extends CriarTabela {
    @Override
    public String getCreateStatement() {
        return "CREATE TABLE IF NOT EXISTS marca (" +
               "id_marca INTEGER PRIMARY KEY AUTOINCREMENT," +
               "descricao TEXT NOT NULL" +
               ")";
    }
}