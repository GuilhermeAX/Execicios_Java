import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaPrimaria = 0, somaSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite um numero para [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n********** Diagonal primaria **********");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrimaria += matriz[i][i];
        }

        System.out.println("\n********** Diagonal secundaria **********");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - i - 1] + " ");
            somaSecundaria += matriz[i][matriz.length - i - 1];
        }

        System.out.println("\n********** Soma primaria **********");
        if(somaPrimaria > 0)
        System.out.println(somaPrimaria);
        else
            System.out.println("ZERO");

        System.out.println("\n********** Soma secundaria **********");
        if(somaSecundaria > 0)
        System.out.println(somaSecundaria);
        else
            System.out.println("ZERO");
    }
}
