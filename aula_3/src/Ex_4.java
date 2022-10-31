import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        int idade, sexo, categoria, back = 0, front = 0, mobile = 0, fullstack = 0;
        String continuar = "S";
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("*  SEJA BEM VIND@ A PESQUISA   *");
        System.out.println("********************************\n");

        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite o sexo (1 - Masculino | 2 - Feminino | 3 - Outros): ");
            sexo = sc.nextInt();
            System.out.print("Digite a categoria (1 - Back-end | 2 - Front-end | 3 - Mobile | 4 - FullStack): ");
            categoria = sc.nextInt();

            if (categoria == 1)
                back++;
            if (sexo == 2 && categoria == 2)
                front++;
            if (sexo == 1 && categoria == 3 && idade > 40)
                mobile++;
            if (sexo == 2 && categoria == 4 && idade < 30)
                fullstack++;


            System.out.print("\nDeseja continuar(S/N)? ");
            sc.skip("\\R?");//Ignore o \n ignore o \r
            continuar = sc.nextLine();
            System.out.println("\n");
        }

        System.out.println("================================================");
        System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + front);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos:  " + mobile);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos:  " + fullstack);
        System.out.println("================================================");

    }
}
