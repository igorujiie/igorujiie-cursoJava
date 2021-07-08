package exercicioP1;

import java.util.Scanner;

public class peças {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod1,cod2,npecas1,npecas2;
        double valor1,valor2, total;


        cod1 = sc.nextInt();
        npecas1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        npecas2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (valor1 * npecas1) + (valor2 * npecas2);

        System.out.printf("Valor total = %.2f", total);

        sc.close();
    }
}
