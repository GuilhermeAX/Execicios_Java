package exercicio1;

import exercicio1.model.Cliente;
import exercicio1.model.PessoaFisica;
import exercicio1.model.PessoaJuridica;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("001.002.003-04", "Alberto", "alberto.1@gmail.com",
                "(99) 97090-0101", "Rua das Aroeiras, 37, - Pesquisa - RT");

        Cliente cliente1 = new Cliente("002.003.004-05", "Monique", "mp.gatinha@hotmail.com",
                "(85) 98585-4765", "Avenida Beira mar, 28 - Fortaleza - CE");

        cliente.visualizar();
        cliente1.visualizar();

        //Exercicio da aula do dia 04/11/22

        Cliente clientePF1 = new PessoaFisica("012.234.345-45", "Diogo", "diogo.fa@gmail.com",
                "(13)97123-0001", "Santos - SP", 1, "14/12/2000");
        Cliente clientePF2 = new PessoaFisica("457.339.872-43", "Fábio Gomes", "ruan_fabio_gomes@iahoo.com",
                "(79) 98143-2224", "Aracaju - SE", 1, "27/03/1970");

        clientePF1.visualizar();
        clientePF2.visualizar();

        Cliente clientePJ1 = new PessoaJuridica(" ", "Comercio de Bebidas Ltda", "fiscal@dcomerciodebebidasltda.com.br",
                "(61) 3998-6726", "Brasília - DF", "27.733.818/0001-70", 2);
        Cliente clientePJ2 = new PessoaJuridica(" ", "Henrique e Thiago Eletrônica Ltda", "ti@henriqueethiagoeletronicaltda.com.br",
                "(98) 98417-3115", "São Luís -MA", "98.172.146/0001-19", 2);

        clientePJ1.visualizar();
        clientePJ2.visualizar();
    }
}
