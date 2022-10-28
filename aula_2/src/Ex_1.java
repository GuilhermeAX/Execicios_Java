import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o 2º numero: ");
        numero2 = scanner.nextInt();
        System.out.print("Digite o 3º numero: ");
        numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("\n\n" + numero1 + " é o maior número digitado!");
        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("\n\n" + numero2 + " é o maior número digitado!");
        } else
            System.out.println("\n\n" + numero3 + " é o maior número digitado!");

    }
}
//Faça um programa que receba três inteiros e diga qual deles é o maior.