import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int numero, par = 0, impar = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("=========================");
        System.out.println("Total de numeros pares: " + par);
        System.out.println("\nTotal de numeros impares: " + impar);
        System.out.println("=========================");
    }
}
