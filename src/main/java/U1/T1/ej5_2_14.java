package U1.T1;

import java.util.Scanner;

public class ej5_2_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa pinta una pirámide.");
        System.out.print("Introduzca un carácter de relleno: ");
        String a = teclado.nextLine();
        System.out.println("Elija un tipo de pirámide");
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        int opcion = teclado.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("  " + a);
                System.out.println(" " + a + a + a);
                System.out.println(a + a + a + a + a);
                break;
            case 2:
                System.out.println(a + a + a + a + a);
                System.out.println(" " + a + a + a);
                System.out.println("  " + a);
                break;
            case 3:
                System.out.println("    " + a);
                System.out.println("  " + a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println("  " + a + " " + a);
                System.out.println("    " + a);
                break;
            case 4:
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
        }
    }
}


