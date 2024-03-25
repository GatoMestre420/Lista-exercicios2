

public class Ex12 {
    public static void executar(){
       

        int[] vet = {0,5,8,1,-6,4,-7,9,10,-14,3,12};

        int produto = 1;

        for(int i = 0; i < vet.length; i++){
            if(vet[i] > 0 && vet[i] %2 == 0){
                produto *= vet[i];
            }
        }

        System.out.println("--------------------------");
        System.out.println("Produto: " + produto);

        
    }

}
