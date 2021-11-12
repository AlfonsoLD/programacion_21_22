package U3.T1.ARRAYS;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[8];
        int mayor, menor;

        for (int i=0; i< numero.length; i++){
            System.out.println("numero");
            numero[i]= sc.nextInt();

        }
        menor = numero[0];
        mayor = numero[0];


        for (int i=1; i< numero.length; i++){
            if (numero[i]>mayor){

                mayor = numero[i];
            }
            else if (numero[i]<mayor){

                menor = numero[i];
            }
        }

        System.out.println(" el mayor es"+mayor);
        System.out.println("el menor es"+menor);
    }
}
