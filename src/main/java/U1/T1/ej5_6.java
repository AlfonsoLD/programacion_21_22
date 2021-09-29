package U1.T1;

import java.util.Scanner;

public class ej5_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double x = 9.8;
        System.out.println("indica el tiempo");
        long t = teclado.nextLong();
        if (t==0 || t < 0) {
            System.out.println("tiempo incorrecto");
        }else {
        System.out.println("la velocidad es de" +x * t);}
    }
}
