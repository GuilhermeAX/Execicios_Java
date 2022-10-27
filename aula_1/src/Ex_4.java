import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        int valor1, valor2, valor3, valor4, diferenca;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextInt();
        System.out.print("Digite o quarto valor: ");
        valor4 = scanner.nextInt();

        diferenca = (valor1 * valor2) - (valor3 * valor4);

        System.out.println("A diferenaça dos produtos é: " + diferenca);

    }
}
