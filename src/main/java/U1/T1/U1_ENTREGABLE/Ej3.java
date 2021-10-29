package U1.T1.U1_ENTREGABLE;

import java.util.Scanner;
//Realiza un programa que solicite al usuario un número entero positivo con una cantidad de 6 cifras exactamente.
// Si el número no tiene esa cantidad de cifras, se vuelve a pedir el número hasta que sea de 6 cifras.

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int digitos = 0;

        while (num != 0) {
            num = num / 10;
            digitos++;
        }


        while (digitos < 6) {
            System.out.println("pon un numero");
            num = teclado.nextInt();

            if ((num % 1000) % num == 0) {
                System.out.println("los tres numeros finales son primos");
                if ((num / 1000) % num == 0) {
                    System.out.println("los tres numeros del principio son primos");


                }
            }
        }
    }
}