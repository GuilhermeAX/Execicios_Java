import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, qtd21 = 0, qtd50 = 0;

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        while (idade > 0) {
            if (idade > 0 && idade < 21) {
                qtd21++;
            } else if (idade > 50) {
                qtd50++;
            }
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + qtd21);
        System.out.println("Total de pessoas maiores de 50 anos: " + qtd50);
    }
}
