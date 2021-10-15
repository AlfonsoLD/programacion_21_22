package U1.T1;

import java.util.Scanner;

public class ej8_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon el valor minimo");
        int minimo = teclado.nextInt();
        System.out.println("pon el valor maximo");
        int maximo = teclado.nextInt();

        for (int i = teclado.nextInt(); i >= maximo || i <= minimo; ) {
            System.out.println("dame numero:");
            i = teclado.nextInt();
        }
    }
}