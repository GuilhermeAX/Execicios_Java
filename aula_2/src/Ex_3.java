import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("\nIDADE DIGITADA É NEGATIVA!!");
        }else if (idade <= 14)
            System.out.println("\nA IDADE SE ENQUADRA NA CATEGORIA INFANTIL");
        else if (idade <= 17)
            System.out.println("\nA IDADE SE ENQUADRA NA CATEGORIA JUVENIL");
        else
            System.out.println("\nA IDADE SE ENQUADRA NA CATEGORIA ADULTO");

    }
}
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/