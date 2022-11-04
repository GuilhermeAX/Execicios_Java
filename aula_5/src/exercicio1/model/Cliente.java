package exercicio1.model;

public class Cliente {
    private int tipo;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    public Cliente(int tipo, String nome, String email, String telefone, String endereco) {
        this.tipo = tipo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

    }


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void visualizar() {
        String tipo = "";
        switch (this.tipo) {
            case 1:
                tipo = "PESSOA FÍSICA";
                break;
            case 2:
                tipo = "PESSOA JURÍDICA";
                break;
        }

        System.out.println("\n************** DADOS D@ CLIENTE "+ tipo+" **************");
        System.out.println("Nome: " + nome);
        System.out.println("Cliente " + tipo);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereco: " + endereco);


    }
}
