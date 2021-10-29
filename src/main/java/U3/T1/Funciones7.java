package U3.T1;

import java.util.Scanner;

// Diseñar una función que nos diga si un número es primo.
public class Funciones7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon un número");
        int numero = sc.nextInt();

        System.out.println(primo(numero));

    }
    public static boolean primo (int a) {
        for (int i=2; i<a;i++)

            if (a%i ==0) {
            return false;
            }
            return true;
    }

}
