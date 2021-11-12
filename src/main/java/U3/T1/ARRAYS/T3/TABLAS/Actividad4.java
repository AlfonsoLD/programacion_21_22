package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numero va a tener la clave");
            int numero = sc.nextInt();

            int[] acierto = new int[numero];

        for (int i = 0; i < acierto.length; i++) {
            acierto[i]= (int) (Math.random()*10);
            System.out.println(acierto[i]);

        }
    }
}
