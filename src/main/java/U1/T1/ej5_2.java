package U1.T1;

import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número 12");
        int x = teclado.nextInt();
        if (x == 12) {
            System.out.println("enhorabuena");
        } else {
            System.out.println("eso no es el 12");
        }
    }
}