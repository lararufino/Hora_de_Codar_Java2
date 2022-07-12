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
            System.out.println("insira um número:");
            double num = entrada.nextDouble();

            numeros.add(num);
            soma += num;
            contador += 1;
        }
        System.out.println("os números são: " + numeros);
        System.out.println("A média é: " + soma/10);
    }
}
