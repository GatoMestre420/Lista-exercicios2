import java.util.Scanner;

public class Ex03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];

        for (int i = 0; i < vet1.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero:");
            vet1[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < vet1.length; i++) {
            vet2[i] = vet1[i] * 2;
        }

        System.out.println("VALORES DOBRADOS DO PRIMEIRO VETOR");
        System.out.println(" ");
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("valores 2º vetor :" + vet2[i]);
        }

        leitor.close();
    }

}
