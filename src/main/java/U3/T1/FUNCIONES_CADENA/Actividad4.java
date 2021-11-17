package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;
//Diseñar una actividad que pida al usuario que introduzca una frase por teclado
//e indique cuántos espacios en blanco tiene.
public class Actividad4 {
    public static void main(String[] args) {
        int espacio=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una frase");
            String frase = sc.nextLine();
    for(int i=0; i<frase.length(); i++){

        if (frase.charAt(i)== ' '){
            espacio++;
        }

    }
        System.out.println("la frase tiene"+espacio+"espacios");

    }
}
