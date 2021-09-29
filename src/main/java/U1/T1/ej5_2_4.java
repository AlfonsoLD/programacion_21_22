package U1.T1;

import java.util.Scanner;

public class ej5_2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon el número de horas que has hecho");
        int horas = teclado.nextInt();
        if (horas <=40) {
            System.out.println("has ganado" + horas * 12);
        }else {
            System.out.println("has ganado" + horas * 16);
        }
    }
}
