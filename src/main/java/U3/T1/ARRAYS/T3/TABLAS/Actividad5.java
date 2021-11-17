package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;
//Coger dos arrays, juntarlos y ordenarlos
public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] wee = new int[6];
        int[] wee2 = new int[6];
        int[] fusion = new int[12];
        for (int i = 0; i < wee.length; i++) {
            System.out.println("pon un numero");
            wee[i]= sc.nextInt();
        }
        for (int i = 0; i < wee2.length; i++) {
            System.out.println("pon mas numeros");
            wee2[i]= sc.nextInt();
        }

        for (int i = 0; i < fusion.length/2 ; i++) {

            fusion[i]= wee[i];
        }
        for (int i = 6; i < fusion.length ; i++) {

            fusion[i]= wee2[i- wee2.length];
        }
        Arrays.sort(fusion);
        System.out.println(Arrays.toString(fusion));
    }
}
