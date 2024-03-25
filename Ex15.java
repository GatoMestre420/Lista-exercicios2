

public class Ex15 {
    public static void executar(){
        

        int tamanho = 5;
        int[] vet = new int[tamanho];
        
       
        System.out.println("Digite o primeiro numero do vetor: ");
            vet[0] = Prompt.lerInteiro();

        System.out.println("---------------------------------------------------");
        
        for(int i = 1; i < tamanho; i++){
            int num;
            do{
                System.out.println("Digite o próximo numero maior que " + vet[i - 1]);
                num = Prompt.lerInteiro();
                if(num > vet[i-1]){
                    vet[i] = Prompt.lerInteiro();
                }
            }while (num <= vet[i -1]);

            
         }

         System.out.println(" ");
         System.out.println("---------------------------------------------------");
         System.out.println("Vetor Prenchido: ");
         for(int i = 0; i < 5; i++){
            System.out.println("Elemento: " + (i+1) + ": " + vet[i]);
         }

         
    }
    

}
