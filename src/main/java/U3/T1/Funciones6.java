package U3.T1;

import java.util.Scanner;

public class Funciones6 {
    public static void main(String[] args) {
//Crear una función que, mediante un booleano,
// indique si el carácter que se pasa como parámetro de entrada corresponde con una vocal.
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("pon una palabra");
        palabra = sc.nextLine();
        System.out.println(Pasa(palabra));
    }

    public static boolean Pasa(String palabra) {
        boolean vocal = false;

        if (palabra.endsWith("a") || palabra.endsWith("e") || palabra.endsWith("i")
                || palabra.endsWith("o") || palabra.endsWith("u")) {
            vocal = true;


        }
        return true;
    }
}