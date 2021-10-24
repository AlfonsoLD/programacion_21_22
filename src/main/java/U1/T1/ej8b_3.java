package U1.T1;

import java.util.Scanner;
//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
public class ej8b_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
        System.out.print("Por favor, introduzca n: ");
        int n = teclado.nextInt();

        switch (n) {
            case 1 -> System.out.print("0");
            case 2 -> System.out.print("0 1");
            default -> {
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;
                while (n > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    n--;
                }
            }
        }
        System.out.println();
    }
}
