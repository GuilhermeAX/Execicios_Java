package exercicio1;

import exercicio1.model.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("001.002.003-04", "Alberto", "alberto.1@gmail.com",
                "(99) 97090-0101", "Rua das Aroeiras, 37, - Pesquisa - RT");

        Cliente cliente1 = new Cliente("002.003.004-05", "Monique", "mp.gatinha@hotmail.com",
                "(85) 98585-4765", "Avenida Beira mar, 28 - Fortaleza - CE");

        cliente.visualizar();
        cliente1.visualizar();
    }
}
