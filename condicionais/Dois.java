package condicionais;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = entrada.nextDouble();

        if(numero > 0){
            System.out.println("O numero � maior que zero");
        } else if(numero < 0) {
            System.out.println("O numero � menor que zero");
        }else {
            System.out.println("O numero � igual a zero");
        }

    }
}
