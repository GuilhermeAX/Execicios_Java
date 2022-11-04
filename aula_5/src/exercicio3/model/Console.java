package exercicio3.model;

public class Console extends Game {
    private String necessario;

    public Console(int codigo, String nome, String plataforma, int anoLancamento, double preco, String necessario) {
        super(codigo, nome, plataforma, anoLancamento, preco);
        this.necessario = necessario;
    }

    public String getNecessario() {
        return necessario;
    }

    public void setNecessario(String necessario) {
        this.necessario = necessario;
    }

    public void visualizar() {
        super.visualizar();
        System.out.print("Necessário: " + necessario);
        System.out.println("\n*************************************************");
    }
}
