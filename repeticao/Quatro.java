package repeticao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Quatro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double soma = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println("insira um n�mero:");
            double num = entrada.nextDouble();

            numeros.add(num);
            soma += num;
            contador += 1;
        }
        System.out.println("os n�meros s�o: " + numeros);
        System.out.println("A m�dia �: " + soma/10);
    }
}
