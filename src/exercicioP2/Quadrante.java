package exercicioP2;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y;

/* programa verifica em qual quadrante as coordenadas(y,x) estao no eixo cartesiano*/
        System.out.println("Coordenadas Y,x: ");
        y = sc.nextDouble();
        x = sc.nextDouble();


        if(x>0 && y> 0){
            System.out.println("Q1");
        }
        else if (x>0 && y< 0){
            System.out.println("Q2");
        }
        else if (x<0 && y<0){
            System.out.println("Q3");
        }
        else if(x==0 && y==0){
            System.out.println("Origem");
        }
        else {
            System.out.println("Q2");
        }

    sc.close();

    }
}
