package exercicio3.model;

public class Jogo extends Game{
    private String classificacao;

    public Jogo(int codigo, String nome, String plataforma, int anoLancamento, double preco, String classificacao) {
        super(codigo, nome, plataforma, anoLancamento, preco);
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Classificacao: " + classificacao);
        System.out.println("\n*************************************************");
    }
}
