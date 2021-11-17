package U3.T1.ARRAYS.T4.MASTABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Escribe un programa que pida 8 palabras y las almacene en un array.
// Acontinuación, las palabras correspondientes a colores se deben almacenar alcomienzo y
// las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras.
// Los colores que conoce el programa deben estar enotro array y son los siguientes: verde, rojo, azul, amarillo,
// naranja, rosa, negro,blanco y morado.

        String[] colores = {"verde", "rojo", "amarillo", "azul", "naranja", "rosa", "negro", "blanco", "morado"};
        String[] palabras = new String[8];
        String[] tablap = new String[0];
        String[] tablacolor = new String[0];
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = sc.nextLine();
            if (palabras[i].equals(colores[0]) || palabras[i].equals(colores[1])
                    || palabras[i].equals(colores[2]) || palabras[i].equals(colores[3]) ||
                    palabras[i].equals(colores[4]) || palabras[i].equals(colores[5]) ||
                    palabras[i].equals(colores[6]) || palabras[i].equals(colores[7]) || palabras[i].equals(colores[8])) {

                tablacolor = Arrays.copyOf(tablacolor, tablacolor.length + 1);
                tablacolor[tablacolor.length - 1] = palabras[i];
            }
            else {

                tablap= Arrays.copyOf(tablap, tablap.length+1);
                tablap[tablap.length-1]=palabras[1];
            }
        }
        System.out.println(Arrays.toString(tablacolor));
        System.out.println(Arrays.toString(tablap));

        System.out.println(Arrays.toString(tablacolor)+Arrays.toString(tablap));
    }
}
