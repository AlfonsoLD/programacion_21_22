package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cuantos numeros vas  introducir?");
        int n = sc.nextInt();
        int[] listapos = new int[n]; //positivos
        int[] listaneg = new int[n]; //negativos
        for (int i = 0; i < listapos.length; i++) {
            int numero = sc.nextInt();

            if (numero >=0){
                listapos[i] = numero;
            }
            else {
                listaneg[i] = numero;
            }
        }

        System.out.println(Arrays.toString(listapos));
        System.out.println(Arrays.toString(listaneg));

    }
}