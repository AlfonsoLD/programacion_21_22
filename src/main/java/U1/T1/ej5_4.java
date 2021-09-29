package U1.T1;
import java.util.Scanner;

public class ej5_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon 2 números");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("los dos son pares");
        } else if (x % 2 == 0 || y % 2 == 0) {
            System.out.println("solo uno es par");
        } else {
            System.out.println("no hay ninguno que sea par");
        }
    }
}