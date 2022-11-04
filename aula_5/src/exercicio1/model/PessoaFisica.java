//Exercicio dia 04/11/22
package exercicio1.model;

public class PessoaFisica extends Cliente {

    private String aniversario;
    private int tipo;

    public PessoaFisica(String cpf, String nome, String email, String telefone, String endereco, int tipo, String aniversario) {
        super(cpf, nome, email, telefone, endereco);
        this.aniversario = aniversario;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar(){
        super.visualizar();
        String tipo = "";
        switch (this.tipo) {
            case 1:
                tipo = "Pessoa Física";
                break;
        }
        System.out.println("Aniversário: " + aniversario);
        System.out.println("Tipo: " + tipo);
        System.out.println("********************************************");
    }
}
