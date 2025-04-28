public class Automovel {
    private int id;
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

    public int getId() {
        return numeroPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public long getRenavam() {
        return renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public double getValorLocacao() {
        return valorLocacao;
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
