import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + (i+1) + "º numero: ");
            numero[i] = scanner.nextInt();
        }
            if (numero[0] > numero[1]) {
                System.out.println("Intervalo inválido");
            }
            else {
                System.out.println("Intervalo válido");

                if (numero[0] % 3 == 0 && numero[0] % 5 == 0) {
                    System.out.println("O número " + numero[0] + " é multiplo de 3 e 5");
                }
                if (numero[1] % 3 == 0 && numero[1] % 5 == 0) {
                    System.out.println("O número " + numero[1] + " é multiplo de 3 e 5");
                }
            }


    }
}
