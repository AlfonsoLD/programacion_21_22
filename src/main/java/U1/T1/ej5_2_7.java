package U1.T1;

import java.util.Scanner;

public class ej5_2_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la primera nota");
        float x = teclado.nextFloat();
        System.out.println("introduce la segunda nota");
        float y = teclado.nextFloat();
        System.out.println("introduce tercera nota");
        float z = teclado.nextFloat();

        float s = (x + y + z) % 3;
        if (s < 5) {
            System.out.println("tu media es suspenso" + s);
        } else if (s == 5) {
            System.out.println("tu media es suficiente" + s);
        } else if (s == 6) {
            System.out.println("tu media es un bien" + s);
        } else if (s == 7 || s == 8) {
            System.out.println("tu media es un notable" + s);
        } else if (s == 9 || s == 10) {
            System.out.println("tu media es un sobresaliente" + s);
        }
    }
}