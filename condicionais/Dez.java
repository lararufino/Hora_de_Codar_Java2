package condicionais;

import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do inicio do odometro:");
        double inicio = entrada.nextDouble();
        System.out.println("Digite o valor do final do odometro:");
        double fin = entrada.nextDouble();
        System.out.println("Digite quanto de combustivel foi gasto:");
        double combustivel = entrada.nextDouble();
        System.out.println("Digite quantos reais voc� ganhou:");
        double dinheiroGanho = entrada.nextDouble();

        double consumoLitro = (fin - inicio) / combustivel;
        double lucro = dinheiroGanho - (combustivel * 2.90);

        System.out.println("O consumo m�dio: " + consumoLitro + "km/L");
        System.out.println("O seu lucro foi: R$" + lucro);
    }
}
