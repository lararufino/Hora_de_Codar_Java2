package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu genero:");
        String genero = entrada.next().toLowerCase();
        System.out.println("Digite sua altura:");
        double altura = entrada.nextDouble();

        if(genero.equals("masculino")){
            double calculo = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal �: " + calculo);
        } else if(genero.equals("feminino")) {
            double calculo = (62.1 * altura) -44.7;
            System.out.println("Seu peso ideal �: " + calculo);
        } else {
            System.out.println("Entrada invalida !!");
        }
    }
}
