package U1.T1;

import java.util.Scanner;

public class ej8b_7 {
    public static void main(String[] args) {
//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un número y te lo escribiré al revés");
        int n = teclado.nextInt();
        int numero = n;
        int volteado = 0;

        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        }

        System.out.println("Si le damos la vuelta al " + n + " tenemos el " + volteado);
    }
    }

