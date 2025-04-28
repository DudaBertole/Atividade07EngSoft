public class Automovel {
    private String placa;
    private long renavam;
    private String chassi;
    private String cor;
    private int numeroPortas;
    private int tipoCombustivel;
    private long quilometragem;
    private double valorLocacao;

    private Modelo modelo;

    public Automovel(String placa, long renavam, String chassi, String cor, int numeroPortas, 
                     int tipoCombustivel, long quilometragem, double valorLocacao) {
        this.placa = placa;
        this.renavam = renavam;
        this.chassi = chassi;
        this.cor = cor;
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.valorLocacao = valorLocacao;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovel{" +
               "placa='" + placa + '\'' +
               ", renavam=" + renavam +
               ", chassi='" + chassi + '\'' +
               ", cor='" + cor + '\'' +
               ", numeroPortas=" + numeroPortas +
               ", tipoCombustivel=" + tipoCombustivel +
               ", quilometragem=" + quilometragem +
               ", valorLocacao=" + valorLocacao +
               '}';
    }
}
