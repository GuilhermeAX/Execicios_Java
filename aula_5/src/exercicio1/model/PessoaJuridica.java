//Exercicio dia 04/11/22
package exercicio1.model;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(int tipo, String nome, String email, String telefone, String endereco, String cnpj) {
        super(tipo, nome, email, telefone, endereco);
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Cnpj: " + cnpj);
    }
}
