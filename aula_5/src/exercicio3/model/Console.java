package exercicio3.model;

public class Console extends Game {
    private String plataforma;

    public Console(int codigo, String nome, String desenvolvedora, int anoLancamento, double preco, String plataforma) {
        super(codigo, nome, desenvolvedora, anoLancamento, preco);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void visualizar() {
        super.visualizar();
        System.out.print("Plataforma: " + plataforma);
        System.out.println("\n*************************************************");
    }
}
