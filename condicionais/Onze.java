package condicionais;

import java.util.Scanner;

public class Onze {
    public static void main(String[] args) {

        double kmInicio, kmFim, gas = 2.90, liGasto, kmGeral, corrida;
        double gasto, lucro;

        Scanner in = new Scanner(System.in);

        System.out.println("INFORME A MARCACAO DO ODOMETRO NO INICIO DO EXPEDIENTE: ");
        kmInicio = in.nextDouble();
        System.out.println("INFORME A MARCACAO DO ODOMETRO NO INICIO DO EXPEDIENTE: ");
        kmFim = in.nextDouble();
        System.out.println("INFORME A QUANTIDADE DE LITROS DE COMBUSTIVEL GASTO: ");
        liGasto = in.nextDouble();
        System.out.println("INFORME O VALOR TOTAL RECEBIDO DAS CORRIDAS: ");
        corrida = in.nextDouble();

        gasto = gas * liGasto;
        kmGeral = (kmFim - kmInicio);
        lucro = (corrida - gasto);
        
        System.out.printf("O MOTORISMA RODOU " + kmGeral + " KM, GASTOU R$ " + gasto + " EM GASOLINA E LUCROU R$ " + lucro);
    }
}
