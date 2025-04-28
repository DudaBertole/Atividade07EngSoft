public class Modelo {
    private int id;
    private String descricao;
    private Marca marca;

    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo{" +
               "descricao='" + descricao + '\'' +
               '}';
    }
    
}
