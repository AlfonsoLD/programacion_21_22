package U3.T1.ARRAYS.T4.MASTABLAS;

import java.util.Arrays;

//Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno
//con números aleatorios entre 200 y 300.
//A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas superior
//izquierda a la esquina inferior derecha, así como el máximo,
//el mínimo y la media de los números que hay en esa diagonal.
public class EJERCICIO5 {
    public static void main(String[] args) {
    int[][]vector = new int[10][10];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j]=(int) (Math.random()*100+200);

                }
            }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }
    }
}
