package U1.T1;

import java.util.Scanner;

public class ej5_2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("que hora es? de 0 a 24");
        int hora = teclado.nextInt();
        if (hora >=6 && hora <=12 ) {
            System.out.println("buenos días");
        }else if (hora >=13 && hora <=20) {
            System.out.println("buenas tardes");
        } else if (hora >=21) {
            System.out.println("buenas noches");
        }else if (hora <=5) {
            System.out.println("buenas noches");
        }
    }
}
