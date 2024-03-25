import java.util.Scanner;

public class Ex08 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

       int[] vetA = {1, 2, 4, 5, 6};
       int[] vetB = {3, 7, 9, 10, 18};

       // Tamanho do vetor C
        int tamanhoC = vetA.length + vetB.length;

        // vetor B para armazenar a concatenação de vetA e vetB
        int[] vetC = new int[tamanhoC];

        for(int i = 0; i < vetA.length; i++){
            vetC[i] = vetA[i];
        }
        for(int i = 0; i < vetB.length; i++){
            vetC[vetA.length + i] = vetB[i]; 
        }

        //exibição do vetC

        for(int i = 0; i < vetC.length; i++){
            System.out.print(vetC[i] + " ");
        }

        leitor.close();
    }

}
