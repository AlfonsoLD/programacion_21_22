package U1.T1;

import java.util.Scanner;

public class ej6_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un número y te diré si es par o impar mediante 1(par) o 0");
   int num = teclado.nextInt();
   if (num %2==0) {
       System.out.println("1");}
   else {
       System.out.println("0");
   }




    }
}
