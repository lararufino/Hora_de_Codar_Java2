package condicionais;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num3 = entrada.nextDouble();


        if(num1 > num2 && num1 > num3){
            System.out.println("O maior numero � o : "  + num1);
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("O maior numero � o : "  + num2);
        }
        if(num3 > num2 && num3 > num1){
            System.out.println("O maior numero � o : "  + num3);
        }

    }
}
