package U1.T1;


import java.util.Scanner;

public class ej5_2_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("pon un número y te diré la última cifra de este");
        numero = teclado.nextInt();
        System.out.println("el número es" + numero %10);
    }
}