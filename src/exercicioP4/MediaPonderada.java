package exercicioP4;

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double x,y,z;

        n= sc.nextInt();

        for (int i=0; i<n;i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            double media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;
            System.out.printf("media = %.2f", media);

        }

    }
}
