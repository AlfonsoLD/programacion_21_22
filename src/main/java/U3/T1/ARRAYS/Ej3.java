package U3.T1.ARRAYS;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] diames = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mes;


        do {
            System.out.println("dime el mes");
            mes = sc.nextInt();
            if (mes >=1 && mes <=12) {
                System.out.println("El mes tiene " + diames[mes - 1] + "días");
            }
        }
        while (mes >=1 && mes <= 12);
    }
}
