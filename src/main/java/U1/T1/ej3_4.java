package U1.T1;

import java.util.Scanner;

public class ej3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce año de nacimiento");
        float num1= teclado.nextShort();
        System.out.println("El resultado es" +num1 * 1609+ "metros");
    }
}
