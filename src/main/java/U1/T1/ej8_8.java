package U1.T1;

import java.util.Scanner;

public class ej8_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long resultado = 1;

        System.out.println("pon un numero");
        int n = teclado.nextInt();
        for (int i =n; i >0; i--) {
            resultado = resultado *i;
            }
            System.out.println("el factorial de" + n + "es" + resultado);
        }
    }