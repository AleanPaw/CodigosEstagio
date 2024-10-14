import java.util.Scanner;

public class Fibonacci {
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(Fibonacci[] args) {
        int numero1;
        int numero2 = 1;
        int soma;

        System.out.println("Digite um número inicial para realizar a sequência de Fibonacci. Serão mostrados os próximos 100 números.");
        numero1 = SCANNER.nextInt();

        System.out.println("Sequência de Fibonacci:");

        for (int i = 0; i < 100; i++) {
            System.out.print(numero1 + "-");
            soma = numero1 + numero2;
            numero1 = numero2;
            numero2 = soma;
        }
    }
}