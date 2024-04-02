import java.util.Scanner;

public class Loteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("**************************");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Apostar de 0 a 100:");
                    System.out.print("Digite um número entre 0 e 100: ");
                    int numeroAposta = scanner.nextInt();

                    if (numeroAposta < 0 || numeroAposta > 100) {
                        System.out.println("Aposta inválida.");
                        break;
                    }

                    int numeroSorteado = (int) (Math.random() * 101);

                    if (numeroAposta == numeroSorteado) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
                    }
                    break;
                case 2:
                    System.out.println("Apostar de A à Z:");
                    // Implementação da lógica para apostar de A à Z
                    break;
                case 3:
                    System.out.println("Apostar em par ou ímpar:");
                    System.out.print("Digite um número inteiro: ");
                    int numeroParImpar = scanner.nextInt();

                    if (numeroParImpar % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
