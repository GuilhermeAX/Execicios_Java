package exercicio3.model;

public class Game {
    private int codigo;
    private String nome;
    private String desenvolvedora;
    private int anoLancamento;
    private double preco;

    public Game(int codigo, String nome, String desenvolvedora, int anoLancamento, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return desenvolvedora;
    }

    public void setPlataforma(String classificacao) {
        this.desenvolvedora = classificacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void visualizar() {
        System.out.println("************ INFORMAÇÕES DO JOGO ****************");
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Desenvolvedora: " + desenvolvedora);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Preço: R$" + preco);

    }
}
