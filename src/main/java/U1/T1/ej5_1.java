package U1.T1;

import java.util.Scanner;

public class ej5_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = teclado.nextInt();
        if (num1 > 0) {
            System.out.println("es positivo");
        } else {
            System.out.println("es negativo");
        }
    }
}
