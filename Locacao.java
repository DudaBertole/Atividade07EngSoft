import java.sql.Date;
import java.sql.Time;

public class Locacao {
    private int id;
    private Cliente cliente;
    private Automovel automovel;
    private Date dataInicio;
    private Date dataFim;
    private Time horaLocacao;
    private Time horaDevolucao;
    private long quilometragemLocacao;
    private long quilometragemDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean devolvida;

    public Locacao(Cliente cliente, Automovel automovel, Date dataInicio, Date dataFim, double valorCaucao) {
        this.cliente = cliente;
        this.automovel = automovel;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorCaucao = valorCaucao;
        this.devolvida = false;
    }

    

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public Time getHoraLocacao() {
        return horaLocacao;
    }

    public Time getHoraDevolucao() {
        return horaDevolucao;
    }

    public long getQuilometragemLocacao() {
        return quilometragemLocacao;
    }

    public long getQuilometragemDevolucao() {
        return quilometragemDevolucao;
    }

    public double getValorCaucao() {
        return valorCaucao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public boolean isDevolvida() {
        return devolvida;
    }

    public void setHoraLocacao(Time horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public void setHoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public void setQuilometragemLocacao(long quilometragemLocacao) {
        this.quilometragemLocacao = quilometragemLocacao;
    }

    public void setQuilometragemDevolucao(long quilometragemDevolucao) {
        this.quilometragemDevolucao = quilometragemDevolucao;
    }

    public void setValorCaucao(double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public void setLocacaoDevolvida(boolean devolvida) {
        this.devolvida = devolvida;
    }

    @Override
    public String toString() {
        return "Locacao{" +
               "cliente=" + cliente +
               ", automovel=" + automovel +
               ", dataInicio=" + dataInicio +
               ", dataFim=" + dataFim +
               ", valorCaucao=" + valorCaucao +
               ", valorLocacao=" + valorLocacao +
               ", devolvida=" + devolvida +
               '}';
    }

    public double getValor() {
        return valorLocacao;
    }
}
