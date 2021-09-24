package U1.T1;

import java.util.Scanner;

public class ej2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de millas");
        int num1 = teclado.nextInt();
        System.out.println("El resultado es" +num1 * 1609+ "metros" );

    }
}
