package U1.T1;

import java.util.Scanner;

public class ej8_14 {
    public static void main(String[] args) {
// Pedir un número n y dibujar un triángulo rectángulo invertido de n elementos de lado
        Scanner teclado = new Scanner(System.in);

        int altura = teclado.nextInt();

        for (int i= 0; i<=altura; i++){
            for(int j=0; j<=altura -i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
