import java.util.Scanner;

public class Ex10 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetA = new int[5];
        int[] vetB = new int[5];

        for(int i = 0; i < vetA.length; i++){
            System.out.println("Digite os valores do primeiro vetor: ");
            vetA[i] = Prompt.lerInteiro();

        }

        for(int i = 0; i < 5; i++){
                vetB[i] = vetA[5 -1 - i];
            }
        

        for(int j = 0; j < vetB.length; j++){
            System.out.print(vetB[j] + " ");
        }

        leitor.close();
    }

}
