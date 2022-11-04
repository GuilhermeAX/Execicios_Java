package exercicio2.model;

public class Gerente extends Funcionarie {

    private String loja;

    public Gerente(int matricula, String nome, String telefone, String email, String endereco, String loja) {
        super(matricula, nome, telefone, email, endereco);
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("Gerente da loja de " + this.loja);
        System.out.println("*******************************************************");
    }
}
