package U1.T1;

import java.util.Scanner;

public class ej5_2_12 {
    public static void main(String[] args) {
        int aux;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa ordena los tres números que pongas.");
        System.out.println("pon el numero 1");
        int a = teclado.nextInt();
        System.out.println("pon el numero 2");
        int b = teclado.nextInt();
        System.out.println("pon el numero 3");
        int c = teclado.nextInt();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        if (c > b) {
            aux = c;
            c = b;
            b = aux;
        }
        if (c > a) {
            aux = c;
            c = a;
            a = aux;
        }
        if (b > a) {
            aux = b;
            b = a;
            a = aux;
        }
        System.out.println("Así es el orden de los números " + a + ", " + b + " y " + c + ".");
    }
}
