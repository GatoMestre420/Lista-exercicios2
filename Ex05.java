import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vet = new int[5];
        int cont = 0;

        for(int i = 0; i < vet.length; i++){
            System.out.println("Informe os numeros:");
            vet[i] = Prompt.lerInteiro();
        }

        System.out.println("Calma! Muita atenção nessa hora.");
        System.out.println("");
        System.out.println("Informe um numero qualquer ai....");
        int n = Prompt.lerInteiro();

        for(int i = 0; i < vet.length; i++){
            if(vet[i] == n){
                cont++;
            }
        }

        if(cont > 1){

            System.out.println("A quantidade de vezes que o numero " + n + " aparece no vetor é: " + cont + " vezes!!");
        }else if(cont == 1){
            System.out.println("A quantidade de vezes que o numero " + n + " aparece no vetor é: " + cont + " vez!!");
        }else{
            System.out.println("Não há esse numero no vetor");
        }
        




        leitor.close();
    }

}
