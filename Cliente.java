public class Cliente {
    private long cpf_cli;
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private String email_cli;

    public Cliente(long cpf_cli, String nom_cli, String end_cli, String tel_cli, String email_cli) {
        this.cpf_cli = cpf_cli;
        this.nom_cli = nom_cli;
        this.end_cli = end_cli;
        this.tel_cli = tel_cli;
        this.email_cli = email_cli;
    }

    public String conCli(){
        return this.toString();
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "cpf_cli=" + cpf_cli + ", nom_cli=" + nom_cli + ", end_cli=" + end_cli + ", tel_cli=" + tel_cli + ", email_cli=" + email_cli + '}';
    }    
}
