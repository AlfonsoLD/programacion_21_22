package U1.T1;

import java.util.Scanner;

public class ej4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("nota 1:");
        float nota1 = teclado.nextFloat();
        System.out.println("nota 2:");
        float nota2 = teclado.nextFloat();
        float suma = nota1 + nota2;
        System.out.println("tu media es: " +suma/2);
    }
}
