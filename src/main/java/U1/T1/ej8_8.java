package U1.T1;

import java.util.Scanner;

public class ej8_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado;

        System.out.println("pon un numero");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j < n; j++) ;
            {resultado = n * (n - 1);
            }
            System.out.println("el factorial de" + n + "es" + resultado);
        }
    }
}