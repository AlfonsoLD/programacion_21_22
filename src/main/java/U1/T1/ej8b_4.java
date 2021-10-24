package U1.T1;

import java.util.Scanner;
//pirámide
public class ej8b_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INDICA LA ALTURA DE LA PIRÁMIDE");
        int altura = teclado.nextInt();
        System.out.println("INDICA EL CARÁCTER DE LA PIRÁMIDE");
        String character = teclado.nextLine();

        for (int i =0; i< altura; i++) {
            for(int j = 0; j < altura - i -1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)-1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
