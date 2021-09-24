package U1.T1;

import java.util.Scanner;

public class ej3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca primer número");
        double num1= teclado.nextDouble();
        System.out.println("introduzca segundo número");
        double num2= teclado.nextDouble();
        System.out.println("el resultado es: " +num1 / num2);


    }
}
