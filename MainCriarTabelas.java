public class MainCriarTabelas {
    public static void main(String[] args) {
        CriarTabela automovel = new CriarTabelaAutomovel();
        CriarTabela cliente = new CriarTabelaCliente();
        CriarTabela locacao = new CriarTabelaLocacao();
        CriarTabela marca = new CriarTabelaMarca();
        CriarTabela modelo = new CriarTabelaModelo();

        automovel.criarTabela();
        cliente.criarTabela();
        locacao.criarTabela();
        marca.criarTabela();
        modelo.criarTabela();

    }
}