import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] vetor = new int[10];//Se quiser fazer com entrada de dados, descomente essa linha e comente a proxima.
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;

        //Se quiser fazer a entrada de dados descomente o código a seguir
        /*for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }*/

        System.out.print("Digite um valor para procurar no vetor: ");
        numero = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.print("O número " + numero + " está localizado na posição: " + i);
                break;
            } else if (i == vetor.length - 1) {
                System.out.print("O número " + numero + " não foi licalizado!");
            }
        }
    }
}
