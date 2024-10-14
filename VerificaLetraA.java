import java.util.Scanner;

public class VerificaLetraA {  
    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite uma palavra:");
        String palavra = SCANNER.nextLine();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' apareceu " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}
