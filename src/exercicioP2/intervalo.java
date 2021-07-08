package exercicioP2;

import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x;

        x = sc.nextDouble();


        if(x>100 && x< 0){
            System.out.println("fora de intervalo");
        }
        else if (x>25 && x<= 50){
            System.out.println("Intervalo[25,50]");
        }
        else if (x>=75 && x<=100){
            System.out.println("Intervalo[75,100]");
        }
        else {
            System.out.println(" Intervalo[0,25]");
        }



    }
}
