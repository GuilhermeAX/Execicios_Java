import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        int numero, contador = 0;
        double media = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero != 0 && numero % 3 == 0) {
                media += (numero);
                contador++;
            }
        } while (numero != 0);

        System.out.println("contador: " + contador);

        System.out.println("A média de todos os números múltiplos de 3 é: " + (media / contador));
    }
}
