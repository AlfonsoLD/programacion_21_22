package U2.T2;

import java.util.Scanner;

public class EjemploDebug {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num = sc.nextInt();

        for (int i= 0; i<num; i++) {
            if (i%2==0) {
                System.out.println("SOY"+i+"Y SOY UN NUMERO PAR");
            }
        }

    }
}
