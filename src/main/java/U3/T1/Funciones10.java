package U3.T1;

import java.util.Scanner;

// Escribir una función que decida si dos números enteros positivos son amigos.
// Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
// del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
public class Funciones10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon un número");
            int numa = sc.nextInt();
            int numb= sc.nextInt();
                System.out.println (divisorsuma(numa, numb));

    }

    public static boolean divisorsuma (int a, int b){
        int sumadea= 0;
        for (int i =1;i<a;i++) {

            if (a%i==0){
                sumadea+=i;
            }
        }

        int sumadeb= 0;
        for (int i =1;i<b;i++) {

            if (b%i==0){
                sumadeb+=i;
            }
        }
        if (sumadea==b && sumadeb==a) {
            return true;
        }
        return false;
    }
}
