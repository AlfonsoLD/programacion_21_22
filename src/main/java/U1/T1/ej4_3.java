package U1.T1;

import java.util.Scanner;

public class ej4_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("nota 1:");
        double nota1 = teclado.nextDouble();
        System.out.println("nota 2:");
        double nota2 = teclado.nextDouble();
        double suma = nota1 + nota2;
        int redondeo = (int) suma/2;
        System.out.println("tu media redondeada es:" +redondeo);
    }
}
