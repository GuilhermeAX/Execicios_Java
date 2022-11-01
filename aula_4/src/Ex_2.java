import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorDeNumeros = new int[10], par = new int[10], impar = new int[10];
        int soma = 0;
        double media = 0;
        DecimalFormat df = new DecimalFormat(".0");

        for (int i = 0; i < vetorDeNumeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: ");
            vetorDeNumeros[i] = scanner.nextInt();
            soma += vetorDeNumeros[i];

            if (i % 2 > 0)
                impar[i] += vetorDeNumeros[i];

            if(vetorDeNumeros[i] % 2 == 0)
                par[i] += vetorDeNumeros[i];
        }

        System.out.println("\n***** Elementos nos índices ímpares do vetor: *****");
        for (int i = 0; i < vetorDeNumeros.length; i++) {
            if (i % 2 > 0)
                System.out.print(" " + impar[i]);
        }

        System.out.println("\n***** Elementos no vetor que são pares: *****");
        for (int i = 0; i < vetorDeNumeros.length; i++) {
            if (par[i] > 0)
                System.out.print(" " + par[i]);
        }

        System.out.println("\nA soma de todos elementos do vetor é: " + soma);

        media = soma / vetorDeNumeros.length;
        System.out.println("\n***** A média dos elementos: " + df.format(media));
    }
}
