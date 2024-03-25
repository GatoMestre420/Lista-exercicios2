//import java.util.Scanner;

public class Ex01 {
    public static void executar() {
        // Scanner leitor = new Scanner(System.in);

        // Criar Vetor para armazenar os números digitados pelo usuário
        double[] numeros = new double[5];

        // Ler os números digitados pelo usuário
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = Prompt.lerDecimal();
        }

        // Calcular a média dos números
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = soma / numeros.length;

        // Exibir os valores manores, iguais e superiores à média
        System.out.println("Valores menores, iguais e superiores à média. MÉDIA: " + media);

        for (double num : numeros) {
            if (num < media) {
                System.out.println(num + " é menor que à média");
            } else if (num == media) {
                System.out.println(num + " é igual à média");
            } else {
                System.out.println(num + " é superior à média");
            }
        }

        // leitor.close();
    }

}
