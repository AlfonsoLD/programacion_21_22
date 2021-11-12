package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos números quieres introducir?");
        int num = sc.nextInt();
        int[] vector = new int[num];
        int[]invertido = new int[num];

        for (int i = 0; i < vector.length; i++) {
          vector[i]= sc.nextInt();

            }
        for (int j = 0; j < vector.length; j++) {
            invertido[j] = vector[vector.length-j-1];
        }
        System.out.println(Arrays.toString(invertido));
    }
}
