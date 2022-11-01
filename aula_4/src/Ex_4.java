import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrizAlunXs = new double[10][4];
        double[] media = new double[10];
        DecimalFormat df = new DecimalFormat(".#");

        for (int i = 0; i < matrizAlunXs.length; i++) {
            for (int j = 0; j < matrizAlunXs[i].length; j++) {
                System.out.print("Digite a " + (j + 1) + "° nota d@ alun@ " + (i + 1) + ": ");
                matrizAlunXs[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < matrizAlunXs.length; i++) {
            for (int j = 0; j < matrizAlunXs[i].length; j++) {
                media[i] += (matrizAlunXs[i][j]) / 4;
            }
        }

        System.out.println("\n\n********** As medias da turma são: **********");
        for (int i = 0; i < media.length; i++) {
            if (media[i] == 0)
                System.out.println("ZERO");
            else
                System.out.print(df.format(media[i]) + " | ");
        }
    }
}
