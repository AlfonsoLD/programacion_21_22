package U1.T1;

import java.util.Scanner;

public class ej5_2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("resuelve la ecuación de primer grado (tipo ax +b=0, introduce el numero a");
        long a = teclado.nextLong();
        System.out.println("ahora el b");
        long b = teclado.nextLong();
        long x = -b%a;
        System.out.println("el resultado es" +x);


    }
}
