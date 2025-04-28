public class Automovel {
    private String placa;
    private String cor;
    private int nroportas;
    private int tipo_combustivel;
    private long quilometragem;
    private long renavam;
    private String chassi;
    private double valor_locacao;
    
    // atributos das Associacoes
    private Modelo modelo;

    public Automovel(String placa, String cor, int nroportas, int tipo_combustivel, long quilometragem, long renavam, String chassi, double valor_locacao) {
        this.placa = placa;
        this.cor = cor;
        this.nroportas = nroportas;
        this.tipo_combustivel = tipo_combustivel;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valor_locacao = valor_locacao;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public String conAuto(){        
        return this.toString();
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }        
    
    @Override
    public String toString() {
        return "Automovel{" + "placa=" + placa + ", cor=" + cor + ", nroportas=" + nroportas + ", tipo_combustivel=" + tipo_combustivel + ", quilometragem=" + quilometragem + ", renavam=" + renavam + ", chassi=" + chassi + ", valor_locacao=" + valor_locacao + '}';
    }    
}
