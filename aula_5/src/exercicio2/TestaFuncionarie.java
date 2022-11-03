package exercicio2;

import exercicio2.model.Funcionarie;

public class TestaFuncionarie {
    public static void main(String[] args) {
        Funcionarie funcionarie = new Funcionarie(001,"RD Brabo","(87)94002-8922",
                "RD.jogador@gmail.com","Avenida Jacaranda, 14 - Petrolina - PB");
        Funcionarie funcionarie1 = new Funcionarie( 002, "Ax", "(61) 98080-1212",
               "Ax_o.o@yahoo.com.br" ,"SCS 311, Cj D, 88 - Brasilía - DF");

        funcionarie.visualizar();
        funcionarie1.visualizar();
    }
}
