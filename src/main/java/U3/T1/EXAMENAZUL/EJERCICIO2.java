package U3.T1.EXAMENAZUL;

import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num<0) {
            System.out.println("dame un número");
            num = sc.nextInt();
        }


        System.out.println("posicion inicial");
        int posin = sc.nextInt();
        System.out.println("posision final");
        int posfin = sc.nextInt();

        switch (posin) {
            case 0 -> {
            }
            case 1 -> {
                num/=10;
            }
            case 2 -> {
                num/=100;
            }
            case 3 -> {
                num/=1000;
            }
            case 4 -> {
                num/=10000;
            }
            case 5 -> {
                num/=100000;
            }
        }
        String c1 = Integer.toString(num);
        switch (posfin) {







        }


    }
}
