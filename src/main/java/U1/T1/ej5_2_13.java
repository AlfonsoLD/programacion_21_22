package U1.T1;

import java.util.Scanner;

public class ej5_2_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un número y te dire si es par y/o divisible entre 5");
        int x = teclado.nextInt();
        if (x % 2 == 0 && x % 5 == 0) {
            System.out.println("es par y divisible entre 5");
        } else if (x % 2 != 0 && x % 5 == 0) {
            System.out.println("es impar y divisible entre 5");
        } else if (x % 2 == 0 && x % 5 != 0) {
            System.out.println("es par y no divisible entre 5");
        } else if (x % 2 != 0 && x % 5 != 0) {
            System.out.println("es impar y no divisible entre 5");
        }
    }
}
