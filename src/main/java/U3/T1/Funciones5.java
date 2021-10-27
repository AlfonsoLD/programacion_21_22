package U3.T1;

import java.util.Scanner;

public class Funciones5 {
    public static void main(String[] args) {
//Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco,
//no hagas el algoritmo de comparación de los 3 números desde cero.

        System.out.println("pon numeros");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(mayor(a, b, c));

    }
    public static int mayor(int a, int b) {
        return Math.max(a, b);
    }
    public static int mayor(int a, int b, int c) {

        int num = mayor(a, b);

        return mayor(num, c);
    }
}
