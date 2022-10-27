import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário bruto: R$");
        salarioBruto = scanner.nextFloat();

        System.out.print("Digite o valor total do adicional noturno: R$");
        adicionalNoturno = scanner.nextFloat();

        System.out.print("Digite o total de horas extras: ");
        horasExtras = scanner.nextFloat();

        System.out.print("Digite o valor dos descontos: R$");
        descontos = scanner.nextFloat();

        salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5)) - descontos;

        System.out.println("O salário líquido do colaborador é: R$" + salarioLiquido);
    }
}
