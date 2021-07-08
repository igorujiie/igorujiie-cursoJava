package exercicioP1;

import java.util.Scanner;

public class TresValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a,b,c, triangulo, circulo,trapezio, quadrado, retangulo,pi ;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        pi =3.14159;
        triangulo =(a*c)/2;
        circulo = pi*c*c;
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;


        System.out.printf("TRIANGULO = %.3f\n",triangulo);
        System.out.printf("CIRCULO = %.3f\n",circulo);
        System.out.printf("TRAPEZIO = %.3f\n",trapezio);
        System.out.printf("QUADRADO = %.3f\n",quadrado);
        System.out.printf("RETANGULO = %.3f\n",retangulo);

        sc.close();
    }
}
