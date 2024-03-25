import java.util.Scanner;

public class Ex06 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double[] notas = new double[5];
        double[] peso = new double[5];

        for(int i = 0; i < notas.length; i ++){
            System.out.println("Informe as 5 notas do aluno:");
            notas[i] = Prompt.lerDecimal();
        }

        for(int i = 0; i < peso.length; i ++){
            System.out.println("Informe os 5 pesos correspondentes: ");
            peso[i] = Prompt.lerDecimal();
        }

        double SomaNotaxPeso = 0;
        double SomaPeso = 0;

        for(int i = 0; i < notas.length; i++){
            SomaNotaxPeso += notas[i] * peso[i];
            SomaPeso += peso[i];
        }

        double MediaPond = SomaNotaxPeso / SomaPeso;


        System.out.println("Média Ponderada: " + MediaPond);



        leitor.close();
    }

}
