package exercicioP4;
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Scanner;

public class DivisaoImpossivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0;i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            double divisao = (double) x/y;

            if(y == 0)
                System.out.println("div Impossible");
            else
                System.out.printf("%.1f",divisao);
        }
    }
}
