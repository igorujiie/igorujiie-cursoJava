package exercicioP1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        int number,horas;
        double valorPorHora,salario;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        horas = sc.nextInt();
        valorPorHora = sc.nextDouble();

        salario = valorPorHora * horas;

        System.out.println("Number = " + number);
        System.out.printf("SALARY = U$%.2f ", salario);
        sc.close();

    }



}
