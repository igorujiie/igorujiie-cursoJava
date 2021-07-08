package exercicioP1;

import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double raio ;
        double pi = 0.00;
        double area = 0.00;
        pi =3.14159;
        raio = sc.nextDouble();
        area = pi*(raio*raio);


        System.out.printf("Area = %.4f", area);
        sc.close();
    }

}
