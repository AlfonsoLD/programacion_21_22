package U1.T1;

import java.util.Scanner;

public class ej6_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un numero");
byte num1= teclado.nextByte();
        System.out.println("pon otro numero");
byte num2= teclado.nextByte();
if (num1 < num2) {
    System.out.println("el menor es" + num1);
} else if (num2 < num1) {
    System.out.println("el menor es" + num2);
}








    }
}
