//Exercicio dia 04/11/22
package exercicio1.model;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private int tipo;

    public PessoaJuridica(String cpf, String nome, String email, String telefone, String endereco, String cnpj, int tipo) {
        super(cpf, nome, email, telefone, endereco);
        this.cnpj = cnpj;
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void visualizar() {
        super.visualizar();
        String tipo = "";
        switch (this.tipo) {
            case 2:
                tipo = "Pessoa Jurídica";
                break;
        }
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Tipo: " + tipo);
        System.out.println("********************************************");
    }
}
