package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Scanner;

public class Actividad7_bidimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][]notas = new int [3][5];
        int suma;
        for (int i = 0; i < notas.length; i++) {
            suma =0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Alumno nº" + (j + 1) + " pon tu nota en el trimestre"+(i+1));
                notas[i][j] = sc.nextInt();
                suma+=notas[i][j];
            }
            System.out.println("La media del trimestre"+(i+1)+"es "+(double)suma/notas[0].length);
        }
        System.out.println("Introduce el alumno");
        int pos = sc.nextInt();
        suma =0;
        for (int i = 0; i < notas.length ; i++) {
            suma+=notas[i][pos];

        }
        System.out.println("La media del alumno "+pos+"es "+((double)suma/ notas.length));
    }
}
