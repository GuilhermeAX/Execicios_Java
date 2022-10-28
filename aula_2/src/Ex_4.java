import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        double numero;
        boolean par, impar;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");

        System.out.print("Digite um número: ");
        numero = scanner.nextFloat();

        par = numero % 2 == 0;

        if (par) {
            System.out.println("O número " + numero + " é PAR");
            System.out.println("A raiz quadrada de " + numero + " é = " + df.format(Math.sqrt(numero)));
        } else {
            System.out.println("O número " + numero + " é ÍMPAR");
            System.out.println(numero + " elevado ao quadradro = " + Math.pow(numero, 2));
        }

    }
}
/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/