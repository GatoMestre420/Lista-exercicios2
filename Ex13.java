

public class Ex13 {
    public static void executar(){
        
        
        // Solicitar o número n
        System.out.print("Digite o número de termos da sequência de Fibonacci desejados: ");
        int n = Prompt.lerInteiro();

        // Gerar a sequência de Fibonacci
        int[] fibonacci = gerarFibonacci(n);

        // Exibir a sequência de Fibonacci
        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

        
    }

    // Método para gerar os primeiros n termos da sequência de Fibonacci
    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];

        // Casos base
        
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        // Gerar os termos restantes
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }

}

