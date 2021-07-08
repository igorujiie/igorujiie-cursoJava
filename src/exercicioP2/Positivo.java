package exercicioP2;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();
        if (x<0)
            System.out.println("Negativo");
        else
            System.out.println("Nao negativo");
    }
}
