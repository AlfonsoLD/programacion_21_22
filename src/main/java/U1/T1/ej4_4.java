package U1.T1;

import java.util.Scanner;

public class ej4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número decimal, usa puntos en vez de ,:");
        float nota1 = teclado.nextFloat();
        float redondeado= Math.round(nota1);
        System.out.println("tu número redondeado es" +redondeado);
    }
}
