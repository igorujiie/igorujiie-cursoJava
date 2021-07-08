package exercicioP2;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y;

        /* programa verifica quanto de imposto deve pagar com base na renda*/
        System.out.println("Renda: ");
        x = sc.nextDouble();


        double imposto;
        if(x<=2000.00){
            System.out.println("Isento");
        }
        else if (x<=3000.00){
            imposto = (x-2000.00)*0.08;
            System.out.println(imposto);
        }
        else if (x<4500.00){
            imposto = (x-3000.00)*0.18 + 1000.0*.08;
            System.out.println(imposto);
        }

        else {
            imposto = (x-4500.00)*0.28 + 1500.0*.18 + 1000 *0.08;
            System.out.println(imposto);
        }

        sc.close();

    }
}
