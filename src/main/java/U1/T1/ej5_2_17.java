package U1.T1;

import java.util.Scanner;

public class ej5_2_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.
        System.out.println("este programa te dice la primera cifra de un numero entero de hasta 5 cifras");
        int n;
        int numero = 0;
        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        n = teclado.nextInt();
        if ( n < 10 ) {
            numero = n;
        }
        if (( n >= 10 ) && ( n < 100 )) {
            numero = n / 10;
        }
        if (( n >= 100 ) && ( n < 1000 )) {
            numero = n / 100;
        }
        if (( n >= 1000 ) && ( n < 10000 )) {
            numero = n / 1000;
        }
        if ( n >= 10000 ) {
            numero = n / 10000;
        }
        System.out.println("La primera cifra es el " + numero);
    }
}
