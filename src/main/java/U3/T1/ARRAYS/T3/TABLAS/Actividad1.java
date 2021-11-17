package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numero= new double [5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("pon un número");
            numero[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(numero));
    }
}
