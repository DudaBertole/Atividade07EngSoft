public class Modelo {
    private String descricao;
    
    // Atributos das Associacoes
    private Marca marca;

    public Modelo(String descricao) {
        this.descricao = descricao;
    }
    
    public String conModelo(){
        return this.toString();
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    @Override
    public String toString() {
        return "Modelo{" + "descricao=" + descricao + '}';
    }    
}
