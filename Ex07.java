import java.util.Scanner;

public class Ex07 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        for(int i = 0; i < vet1.length; i++){
            System.out.println("informe os cinco elementos do primeiro vetor: ");
            vet1[i] = Prompt.lerInteiro();
        }

        System.out.println("");
        System.out.println("-------------------------------------------------------");

        for(int i = 0; i < vet2.length; i++){
            System.out.println("informe os cinco elementos do segundo vetor: ");
            vet2[i] = Prompt.lerInteiro();
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("");
        int cont =0;

        for(int i = 0; i < vet1.length; i++){
            if(vet1[i] == vet2[i]){
                cont++;
            }
        }

        if(cont == 5){
            System.out.println("OS DOIS VETORES SÃO 100% IGUAIS!");
        }else{
            System.out.println("OS 2 VETORES NÃO SÃO IGUAIS!");
        }

        leitor.close();
    }

}
