package U1.T1;

import java.util.Scanner;

public class ej2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número C");
        int num1 = teclado.nextInt();
        System.out.println("El resultado es" +9*num1/5+32+ "Fahrenheit");
    }
}
