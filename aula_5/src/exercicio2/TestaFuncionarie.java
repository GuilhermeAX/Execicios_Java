package exercicio2;

import exercicio2.model.Funcionarie;
import exercicio2.model.Gerente;
import exercicio2.model.Vendedor;

public class TestaFuncionarie {
    public static void main(String[] args) {
        Funcionarie funcionarie = new Funcionarie(001, "RD Brabo", "(87)94002-8922",
                "RD.jogador@gmail.com", "Avenida Jacaranda, 14 - Petrolina - PB");
        Funcionarie funcionarie1 = new Funcionarie(002, "Ax", "(61) 98080-1212",
                "Ax_o.o@yahoo.com.br", "SCS 311, Cj D, 88 - Brasilía - DF");

        funcionarie.visualizar();
        funcionarie1.visualizar();

        //Exercicio dia 04/11/22

        Funcionarie vendedor = new Vendedor(003, "Ricardo Geraldo Fogaça", "(92) 3869-4324",
                "ricardogeraldofogaca@cancaonova.com", "Manaus - AM", 2);
        Funcionarie vendedor1 = new Vendedor(004, "Evelyn Joana Peixoto", "(69)99558-5629",
                "evelyn-peixoto72@tadex.com.br", "Porto Velho - RO", 4);
        vendedor.visualizar();
        vendedor1.visualizar();

        Funcionarie gerente = new Gerente(005, "Bianca Luiza Pires", "(19)3907-2021",
                "bianca_luiza_pires@tkk.com.br", "Santa Bárbara D'Oeste - SP", "Santa Bárbara D'Oeste - SP");
        Funcionarie gerente1 = new Gerente(006,"César Nicolas Aragão","(44) 3969-3442",
                "cesar_aragao@atualvendas.com","Maringá - PR","Maringá - PR");
        gerente.visualizar();
        gerente1.visualizar();
    }
}
