package exercicioP2;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaIni,horaFin;



        horaIni = sc.nextInt();
        horaFin = sc.nextInt();
        int tempo;

        if(horaIni < horaFin) {
            tempo = horaFin - horaIni;
        }else{
            tempo = 24 - horaIni + horaFin;
        }

        System.out.println(tempo);

        sc.close();

    }
}
