package U1.T1;

import java.util.Scanner;

public class ej2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        int num2= teclado.nextInt();
        System.out.println("resultado" +num1 / num2);
        int num3= (num1 - num2 - (num1 / num2));
        System.out.println("el resto es" +num3 );
    }
    }
