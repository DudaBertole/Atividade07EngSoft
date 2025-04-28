public class Cliente {
    private int id;
    private long cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(long cpf, String nome, String endereco, String telefone, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "cpf=" + cpf +
               ", nome='" + nome + '\'' +
               ", endereco='" + endereco + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
