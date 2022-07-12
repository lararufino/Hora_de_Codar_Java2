package condicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            double numero = entrada.nextDouble();

            lista.add(numero);
        }

        for (double num: lista) {
            soma += num;
        }

        double media = soma/ lista.size();
        System.out.println("A media dos numeros é: " + media);
    }
}