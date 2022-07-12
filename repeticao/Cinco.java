package repeticao;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        double total = 0;
        int contador = 0;

        while (contador < 4) {
            System.out.println("insira sua nota: ");
            double num = entrada.nextDouble();

            soma += num;
            contador += 1;
        }

        total = soma / contador;

        if (total >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } 
    }
}
