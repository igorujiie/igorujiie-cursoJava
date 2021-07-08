package exercicioP2;

import java.util.Scanner;

public class EscolhaIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo,qtd;
        double preco;
        System.out.println("digite codigo e qtd:");
        codigo = sc.nextInt();
        qtd = sc.nextInt();


        if(codigo ==1){
            preco = 4.00*qtd;
        }
        else if (codigo ==2){
            preco = 4.50*qtd;
        }
        else if (codigo ==3){
            preco = 5.00*qtd;
        }
        else if (codigo ==4){
            preco = 2.00*qtd;
        }
        else{
            preco = 1.5*qtd;
        }
        System.out.printf("Total = %.2f",preco);


    }
}
