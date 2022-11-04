//Exercicio dia 04/11/22
package exercicio1.model;

public class PessoaFisica extends Cliente {

    private String cpf;

    public PessoaFisica(int tipo, String nome, String email, String telefone, String endereco,String cpf) {
        super(tipo, nome, email, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void visualizar(){
        super.visualizar();
        System.out.println("CPF: " + cpf);
    }
}
