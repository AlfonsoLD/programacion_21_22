package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;
// Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio
public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();



        if (frase.charAt(frase.length()/2)== ' ') {
            System.out.println("la posición central es espacio");

        }else {
            System.out.println("la posición no es espacio");
        }
    }
}
