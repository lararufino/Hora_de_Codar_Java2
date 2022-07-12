package condicionais;

import java.util.Scanner;

public class VinteQuatro {
    public static void main(String[] args) {
        int java1, java2, gira1, gira2, somaJG=0, somaGJ=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Nao aceito Javalis da mesma idade");
            System.out.println("Informe a idade do Javali 1: ");
            java1 = in.nextInt();
            System.out.println("Informe a idade do Javali 2: ");
            java2 = in.nextInt();
        }while(java1 == java2);
        do{
            System.out.println("Nao aceito Girafas da mesma idade");
            System.out.println("Informe a idade da Girafa 1: ");
            gira1 = in.nextInt();
            System.out.println("Informe a idade da Girafa 2: ");
            gira2 = in.nextInt();
        }while(gira1 == gira2);
        if (java1 > java2){
            if (gira1 < gira2){
                somaJG = java1 + gira1;
            }else{
                somaJG = java1 + gira2;
            }
        }else{
            if (gira1 < gira2){
                somaJG = java1 + gira1;
            }else{
                somaJG = java1 + gira2;
            }
        }
        if (gira1 > gira2){
            if (java1 < java2){
                somaGJ = gira1 + java1;
            }else{
                somaGJ = gira1 + java2;
            }
        }else{
            if (java1 < java2){
                somaGJ = gira2 + java1;
            }else{
                somaGJ = gira2 + java2;
            }
        }
        System.out.println("A soma das idades do Javali mais velho com a Girafa mais nova eh: "+somaJG);
        System.out.println("A soma das idades da Girafa mais velha com o Javale mais novo eh: "+somaGJ);
    }
}