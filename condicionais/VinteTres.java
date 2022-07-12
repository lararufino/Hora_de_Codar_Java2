package condicionais;

import java.util.*;

public class VinteTres {
    public static void main(String[] args) {
        int n, contMaior, contMenor, veriMaior = 0, veriMenor = 0, menor = 0, maior = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            System.out.printf("INFORME O %d NUMERO: ",i);
            n = in.nextInt();

            contMaior = n;
            if (contMaior > veriMaior){
                veriMaior = n;
                maior = veriMaior;
            }else{
                if (veriMaior == 0){
                    veriMaior = n;
                }
            }

            contMenor = n;
            if (contMenor < veriMenor){
                veriMenor = n;
                menor = veriMenor;
            }else{
                if (veriMenor == 0){
                    veriMenor = n;
                    menor = veriMenor;
                }
            }
        }
        System.out.println(maior +" EH O MAIOR NUMERO INFORMADO");
        System.out.println(menor +" EH O MENOR NUMERO INFORMADO");
    }
}