package U3.T1;

import java.util.Scanner;

//Implementar la función divisoresPrimos() que muestra, por consola,
// todos los divisores primos del número que se le pasa como parámetro
public class Funciones9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("pon un número");
        int numero = sc.nextInt();
        divisoresPrimos(numero);
    }

    public static void divisoresPrimos(int a) {
        for (int i = 1; i < a; i++) {

            if (a % i == 0 && primo(a)) {
                System.out.println(i + "es primo");
            }

        }

    }

    public static boolean primo(int a) {
        for (int i = 2; i < a; i++)

            if (a % i == 0) {
                return false;
            }
        return true;
    }
}