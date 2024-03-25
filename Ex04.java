import java.util.Scanner;

public class Ex04 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vet = new int[5];

        for(int i = 0; i < vet.length; i++){
            System.out.println("Informe os numeros! ");
            vet[i] = Prompt.lerInteiro();
        }

        System.out.println("");
        System.out.println("Agora muita atenção!!");
        System.out.println("");
        System.out.println("Informe um numero qualquer ai....");
        int n = Prompt.lerInteiro();

        for(int i = 0; i < vet.length; i++){
            if(vet[i] < n){
                System.out.println("Indice (" + (i+1) + ") elemento " + vet[i] + " menor que " + n);
            }
        }


        leitor.close();
    }

}
