import java.util.Scanner;

public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int tamanho = 5;
        int[] vet = new int[tamanho];

        // Lendo os elementos do vetor
        System.out.println("Digite os numeros do vetor:");
        for(int i = 0; i < tamanho; i++){
            vet[i] = Prompt.lerInteiro();
        }

        // encontrando o indice de maior elemento do vetor
        int indiceMaior = 0;
        for(int i = 1; i < tamanho; i++){
            if(vet[i] > vet[indiceMaior]){
                indiceMaior = i;
            }
        }

        //trocando o maior elemento com o último elemento do vetor
        int aux = vet[indiceMaior];
        vet[indiceMaior] = vet[tamanho - 1];
        vet[tamanho - 1] = aux;

        // Exibindo o vetor atualizado 
        System.out.println("OS valores atualizados com o maior elemento na última posição: ");
        for(int i = 0; i < tamanho; i++){
            System.out.print(vet[i] + " ");
        }


        leitor.close();
    }

}
