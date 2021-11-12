package U3.T1.ARRAYS;

import java.util.Scanner;

public class Propuesto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] orden = new int[5];

        int total =0;
        for (int i=0; i< orden.length; i++){
            System.out.println("pon un numero");
            orden [i]= sc.nextInt();
            total+=orden[i];
        }
        System.out.println("la mediA ES: "+total/ orden.length);

        for (int i=0; i< orden.length; i++){
            if (orden[i]>(total/ orden.length)){
                System.out.println(orden[i] +" es mayor que la media");
            }
        }
    }
}
