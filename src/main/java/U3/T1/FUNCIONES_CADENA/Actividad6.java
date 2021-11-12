package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;

//Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe insertar otra
// intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
// El programa debe escribir "Acertaste" o "Fallaste".
public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("acierta la contraseña, jugador 1 inserta la contraseña");
        String contra = sc.nextLine();

        System.out.println("jugador 2 mete la contraseña");
        String adivino = sc.nextLine();

        if (contra.equals(adivino)){
            System.out.println("acertaste");
        }
        else {
            System.out.println("La contraseña tiene: "+ contra.length()+"caracteres");
            System.out.println("La primera letra es"+ contra.charAt(0));
            System.out.println("La última letra es"+ contra.charAt(contra.length()-1));
        }
        while (!contra.equals(adivino)){
            adivino =sc.nextLine();
            System.out.println("fallaste");

        }

    }
}
