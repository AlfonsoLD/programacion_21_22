package U3.T1.ARRAYS;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        int [] v1 = new int [3];
        int[] v2 = new int [3];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<v1.length; i++){
            System.out.println("introduce valor para el v1 en pos "+i);
            v1[i]= sc.nextInt();

            System.out.println("introduce valor para el v2 en pos "+i);
            v2[i] = sc.nextInt();

        }


        for (int i= 0; i< v1.length; i++){
            if (i==0){
                System.out.print("("+v1[i]+",");

            }
            else if (i==v1.length-1){
                System.out.println(v1[i]+")");
            }
            else {
                System.out.print(v1[i]+",");
            }
        }
        for (int i= 0; i< v2.length; i++){
            if (i==0){
                System.out.print("("+v2[i]+",");

            }
            else if (i==v2.length-1){
                System.out.println(v2[i]+")");
            }
            else {
                System.out.print(v2[i]+",");
            }
        }


    }
}
