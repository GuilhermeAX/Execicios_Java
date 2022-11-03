package exercicio3.model;

public class Game {
    private int codigo;
    private String nome;
    private String plataforma;
    private int anoLancamento;
    private double preco;

    public Game(int codigo, String nome, String plataforma, int anoLancamento, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.plataforma = plataforma;
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
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
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
        System.out.println(codigo + " - " + nome + " - " + plataforma + " - " + anoLancamento + " - R$" + preco);
        System.out.println("*************************************************");
    }
}
