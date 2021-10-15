package U1.T1;

import java.util.Scanner;

public class ej8_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe un numero");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}