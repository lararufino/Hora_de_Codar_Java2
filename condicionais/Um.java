package condicionais;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("O maior numero � o: " + num1);
        } else if(num1 < num2){
            System.out.println("O maior numero � o: " + num2);
        }else {
            System.out.println("Eles s�o iguais");
        }

    }
}
