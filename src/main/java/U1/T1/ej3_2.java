package U1.T1;

import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce año de nacimiento");
        short num1= teclado.nextShort();
        System.out.println("Introduce el año actual");
        short num2= teclado.nextShort();
        System.out.print("El resultado es" +num1 + -num2);
    }
}