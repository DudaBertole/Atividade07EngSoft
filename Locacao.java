import java.sql.Time;
import java.sql.Date;

public class Locacao {
    private Date dt_locacao;
    private Time hora_locacao;
    private Date dt_devolucao;
    private Time hora_devolucao;
    private long quilometragem;
    private double valor_caucao;
    private double valor_locacao;
    private int devolvido;

    public Locacao(Date dt_locacao, Time hora_locacao, long quilometragem, double valor_caucao) {
        this.dt_locacao = dt_locacao;
        this.hora_locacao = hora_locacao;
        this.quilometragem = quilometragem;
        this.valor_caucao = valor_caucao;
    }

    public void setDt_devolucao(Date dt_devolucao) {
        this.dt_devolucao = dt_devolucao;
    }

    public void setHora_devolucao(Time hora_devolucao) {
        this.hora_devolucao = hora_devolucao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public void setDevolvido(int devolvido) {
        this.devolvido = devolvido;
    }

    public int regLoc(){
        // Nao sei o que esse metodo deveria fazer...
        return 1;
    }
    
    @Override
    public String toString() {
        return "Locacao{" + "dt_locacao=" + dt_locacao + ", hora_locacao=" + hora_locacao + ", dt_devolucao=" + dt_devolucao + ", hora_devolucao=" + hora_devolucao + ", quilometragem=" + quilometragem + ", valor_caucao=" + valor_caucao + ", valor_locacao=" + valor_locacao + ", devolvido=" + devolvido + '}';
    }    
}
