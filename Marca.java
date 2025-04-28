public class Marca {
    private int id;
    private String descricao;

    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Marca{" +
               "descricao='" + descricao + '\'' +
               '}';
    }
}
