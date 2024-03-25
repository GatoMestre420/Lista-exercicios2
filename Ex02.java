import java.util.Scanner;

public class Ex02 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);


        System.out.println("Informe o tamanho da sequencia: ");
        int tamanho = Prompt.lerInteiro();
        
        int[] numero = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Informe o numero: ");
            numero[i] = Prompt.lerInteiro();
        }

        for(int i = 0; i < tamanho; i++){
            if(numero[i] > 0){
                System.out.println("Numero Positivo: " + numero[i] + " na " + (i+1) + "º posição do vetor."); 
            }
            if(numero[i] < 0){
                System.out.println("Numero Negativo: " + numero[i] + " na " + (i+1) + "º posição do vetor.");
            }
            if(numero[i] == 0){
                System.out.println("Numero Igual a " + numero[i] + " na "  + (i+1) + "º pisição do vetor.");
            }
        }


        leitor.close();
    }

}
