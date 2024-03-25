import java.util.Scanner;

public class Ex11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int[] vetA = {0, 2, 4, 6,8};
        int[] vetB = {1, 3, 5, 7, 9};

        double produtoEscalar = 0;

        for(int i = 0; i < vetA.length; i++){
         produtoEscalar += (vetA[i]) * (vetB[i]);
        }

        System.out.println("------------------------------");
        System.out.println("O produto escalar é : " + produtoEscalar);



    leitor.close();
    

     }
    
}
