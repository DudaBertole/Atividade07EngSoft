public class Marca {
    private String descricao;

    public Marca(String descricao) {
        this.descricao = descricao;
    }
    
    public String conMarca(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Marca{" + "descricao=" + descricao + '}';
    }    
}
