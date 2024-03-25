import java.util.Scanner;

public class Ex09 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetA = new int[5];
        int[] vetB = new int[5];
        int[] vetC = new int[5];

        for(int i = 0; i < vetA.length; i++){
            System.out.println("Digite os valores do vetA: ");
            vetA[i] = Prompt.lerInteiro();
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        for(int i = 0; i < vetB.length; i++){
            System.out.println("Digite os valores de vetB: ");
            vetB[i] = Prompt.lerInteiro();
        }

        for(int i = 0; i < vetC.length; i++){
            if(i %2 == 0){
                vetC[i] = vetA[i];
            }else{
                vetC[i] = vetB[i];
            }
        }

        for(int i = 0; i < vetC.length; i++){
            System.out.print(vetC[i] + " ");
        }


        leitor.close();
    }

}
