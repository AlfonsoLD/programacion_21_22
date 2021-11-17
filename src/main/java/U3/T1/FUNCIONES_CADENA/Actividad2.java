package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;

// Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas
// con espacios en blanco. Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier
// combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.
public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        System.out.println("pon tu frase");
        String palabra ="";


    while (!palabra.equals("fin")){
            System.out.println("sigue");
            palabra = sc.nextLine();

            if (!palabra.equals("fin")){
                frase +=palabra + " ";
            }
        }
    System.out.println(frase);
    }
}
