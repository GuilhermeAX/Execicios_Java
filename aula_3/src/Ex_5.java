import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        int numero, soma = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite o numero: ");
            numero = scanner.nextInt();
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("================================================================");
        System.out.println("A soma dos números positivos é: " + soma);
        System.out.println("================================================================");
    }
}
