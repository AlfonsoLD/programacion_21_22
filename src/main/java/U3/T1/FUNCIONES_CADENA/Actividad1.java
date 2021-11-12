package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;
//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("palabra 1");
            String p1 = sc.nextLine();
        System.out.println("palabra 2");
            String p2 = sc.nextLine();

            if (p1.length()<p2.length()) {

                System.out.println("la palabra 1 es más corta");

            }else {
                System.out.println("la palabra 2 es más corta");
            }

    }

}
