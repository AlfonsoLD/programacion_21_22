package U1.T1;

import java.util.Scanner;
//un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
public class ej8_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca un número");
        int numerousuario = teclado.nextInt();
        for (int j = 2; j < numerousuario; j++) {
            boolean es_primo = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    es_primo = false;
                    break;
                }
            }
            if (es_primo) {
                System.out.println(j+"es primo");
            } else {
                System.out.println(j+"no es primo");
            }
        }
    }
}