package U3.T1;

import java.util.Scanner;

//Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
public class Funciones4 {
    public static void main(String[] args) {


        System.out.println("pon numeros");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mayor(a, b);


    }
    public static void mayor(int a, int b) {

        if (a>b) {
            System.out.println("el mayor es"+a);
        }
        else if ( b>a){
            System.out.println("el mayor es"+b);
        }
    }


}
