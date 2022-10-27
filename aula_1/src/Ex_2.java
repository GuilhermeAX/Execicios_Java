import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        double nota = 0, media;
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0");

        for (int contador = 0; contador < 4; contador++) {
            System.out.print("Digite a " + (contador + 1) + "º nota: ");
            nota += leia.nextDouble();
        }

        media = nota/4;
        System.out.println("\nA média das notas é = "+ df.format(media));
    }
}