package exercicio2.model;

public class Vendedor extends Funcionarie{

    private int percentualVenda;
    public Vendedor(int matricula, String nome, String telefone, String email, String endereco, int percentualVenda) {
        super(matricula, nome, telefone, email, endereco);
        this.percentualVenda = percentualVenda;
    }

    public int getPercentualVenda() {
        return percentualVenda;
    }

    public void setPercentualVenda(int percentualVenda) {
        this.percentualVenda = percentualVenda;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Quantos % sob as vendas: " + this.percentualVenda+"%");
        System.out.println("*******************************************************");
    }
}
