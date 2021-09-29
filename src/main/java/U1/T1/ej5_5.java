package U1.T1;

import java.util.Scanner;

public class ej5_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dale pon 3 números");
        long x = teclado.nextLong();
        long y = teclado.nextLong();
        long z = teclado.nextLong();
        if (x > y && x > z) {
            System.out.println("el mayor es" + x);
        } else if (y > x && y > z) {
            System.out.println("el mayor es " + y);
        } else if (z > x && z > y) {
            System.out.println("el mayor es" + z);
        }
    }
}
