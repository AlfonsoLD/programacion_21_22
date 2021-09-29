package U1.T1;

import java.util.Scanner;

public class ej5_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un número");
        int x = teclado.nextInt();

        if (x % 2 == 0) {
            System.out.println("el número es par");

        } else {
            System.out.println("es impar");
        }
    }
}
