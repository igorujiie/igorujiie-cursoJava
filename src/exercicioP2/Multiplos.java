package exercicioP2;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();
        if (x%y == 0 || y%x ==0)
            System.out.println("multiplos");
        else
            System.out.println("Nao multiplos");
        sc.close();
    }
}
