package condicionais;

import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tamanhoPista = entrada.nextDouble();
        double numeroVoltas = entrada.nextDouble();
        double reabastecimento = entrada.nextDouble();
        double consumoCarro = entrada.nextDouble();

        double convers�oKm = (tamanhoPista * numeroVoltas) / 1000;
        double minimoLitros = (convers�oKm / reabastecimento) / consumoCarro;
        double totalLitros = convers�oKm * consumoCarro;

        System.out.println("O minimo de litros para a primeira parada �: " + minimoLitros);
        System.out.println("O tamanho da pista: " + convers�oKm + "Km");
        System.out.println("O total de litros � de: " + totalLitros);

    }
}
