import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, qdtVinteUm = 0, qdtCinquenta = 0;

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        while (idade >= 0) {
            if (idade >= 0 && idade < 21) {
                qdtVinteUm++;
            } else if (idade > 50) {
                qdtCinquenta++;
            }
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + qdtVinteUm);
        System.out.println("Total de pessoas maiores de 50 anos: " + qdtCinquenta);
    }
}
