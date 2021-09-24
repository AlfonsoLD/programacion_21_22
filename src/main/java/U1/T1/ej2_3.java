package U1.T1;

import java.util.Scanner;

public class ej2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int num2= teclado.nextInt();
        System.out.println("resultado" +num1 / num2);
    }
}
