package U3.T1.ARRAYS;

import java.awt.desktop.OpenURIEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int[] numeros = new int [1000];
        int pos=0;
        int opcion;

        do {
            System.out.println("1 introduce");
            System.out.println("2 busca");
            System.out.println("3 salir");
            System.out.println("que quiere");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("introduce el nuevo valor");
                int n = sc.nextInt();
                numeros[pos] = n;
                pos++;


            } else if (opcion == 2) {
                System.out.println("Introduce el número a buscar");
                int n = sc.nextInt();
                numeros[pos]=n;
                boolean esta = false;

                for (int i = 0; i < pos; i++) {

                    if (numeros[i] == n) {

                        esta = true;
                        break;
                    }

                }
                if (esta){
                System.out.println("el número está");

                }   else {
                        System.out.println("el número no está");
                    }
            }
        }while (opcion!=3);


    }
}
