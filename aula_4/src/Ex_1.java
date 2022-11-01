import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[] vetor = new int[10];//Se quiser fazer com entrada de dados, descomente essa linha e comente a proxima.
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int num;

        //Se quiser fazer a entrada de dados descomente o código a seguir
        /*for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor para a posição " + i);
            vetor[i] = in.nextInt();
        }*/

        System.out.println("Digite um valor para procurar no vetor");
        num = in.nextInt();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == num){
                System.out.println("O índice do número digitado é " + i);

            } else if(i == vetor.length-1){
                System.out.println("Número não encontrado no vetor");
            }
        }
    }
}
