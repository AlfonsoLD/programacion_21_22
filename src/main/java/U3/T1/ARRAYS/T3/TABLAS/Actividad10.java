package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
//Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional
// que debe rellenar de la siguiente forma: se leerá por teclado una serie de números, guardando en la tabla los pares
// hasta que esté llena, e ignorando los impares. La función tiene que devolver la cantidad de impares desechados.
        int[] numeros = new int[5];

        System.out.println("Número de impares desechados"+rellenaPares(numeros));
        System.out.println(Arrays.toString(numeros));
    }
    public static int rellenaPares (int[] vector){
        int impares= 0;
        int posicion = 0;
        int num;
        do{
            System.out.println("Dime un numero");
            Scanner sc = new Scanner(System.in);
            num= sc.nextInt();
            if (num%2==0){
                vector[posicion]=num;
                posicion++;
            }
            else {
                impares++;
            }

        }while (posicion< vector.length);

            return impares;
    }
}
