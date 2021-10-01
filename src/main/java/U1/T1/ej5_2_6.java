package U1.T1;

import java.util.Scanner;

public class ej5_2_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la primera nota");
        float x = teclado.nextFloat();
        System.out.println("introduce la segunda nota");
        float y = teclado.nextFloat();
        System.out.println("introduce tercera nota");
        float z = teclado.nextFloat();

        float s = (x+y+z)%3;
        System.out.println("tu media es" +s);






    }
}
