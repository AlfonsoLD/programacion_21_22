package U3.T1;

import java.util.Scanner;

//Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
public class Funciones8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("pon un número");
        int numero = sc.nextInt();
        System.out.println(divisores(numero));
    }
    public static boolean primo (int a) {
        for (int i=2; i<a;i++)

            if (a%i ==0) {
                return false;
            }
        return true;
    }
    public static int divisores (int a) {
    int ndedivisores =0;
        for ( int i=1; i<a;i++) {

           if (a%i==0 && primo(a)) {
               ndedivisores++;
           }


        }
        return ndedivisores;
    }

}
