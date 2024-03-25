//import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        //Scanner leitor = new Scanner(System.in);

        System.out.println("Lista de Exercicios - VETORES E REPETIDORES ");

        int n;

        System.out.println("informe o numero do exercicio que deseja rodar: 1 à 15 ");
        n = Prompt.lerInteiro();

        do {

            switch (n) {
                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                case 1:
                    System.out.println("Exercicio 01");
                    Ex01.executar();
                    break;

                case 2:
                    System.out.println("Exercicio 02");
                    Ex02.executar();
                    break;

                case 3:
                    System.out.println("Exercicio 03");
                    Ex03.executar();
                    break;

                case 4:
                    System.out.println("Exercicio 04");
                    Ex04.executar();
                    break;

                case 5:
                    System.out.println("Exercicio 05");
                    Ex05.executar();
                    break;

                case 6:
                    System.out.println("Exercicio 06");
                    Ex06.executar();
                    break;

                case 7:
                    System.out.println("Exercicio 07");
                    Ex07.executar();
                    break;

                case 8:
                    System.out.println("Exercicio 08");
                    Ex08.executar();
                    break;

                case 9:
                    System.out.println("Exercicio 09");
                    Ex09.executar();
                    break;

                case 10:
                    System.out.println("Exercicio 10");
                    Ex10.executar();
                    break;

                case 11:
                    System.out.println("Exercicio 11");
                    Ex11.executar();
                    break;

                case 12:
                    System.out.println("Exercicio 12");
                    Ex12.executar();
                    break;

                case 13:
                    System.out.println("Exercicio 13");
                    Ex13.executar();
                    break;

                case 14:
                    System.out.println("Exercicio 14");
                    Ex14.executar();
                    break;

                case 15:
                    System.out.println("Exercicio 15");
                    Ex15.executar();
                    break;

                default:
                    System.out.println("Informe um número de 1 à 15 ou 0 para sair!");
                    break;

            }

        } while (n != 0);

        //leitor.close();
    }

}
