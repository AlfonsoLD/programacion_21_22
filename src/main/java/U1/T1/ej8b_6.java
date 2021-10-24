package U1.T1;

import java.util.Scanner;
//PIRAMIDE HUECA
public class ej8b_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon la altura");
        int altura = teclado.nextInt();
        System.out.println("pon el carácter");
        String character = teclado.nextLine();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2) -1; j++) {
                if (j == (altura - 1) - i || j == (altura-1) +i || i == (altura-1)){
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}