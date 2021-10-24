package U1.T1;

import java.util.Scanner;

public class ej8b_10 {
    public static void main(String[] args) {
//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura.
// Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura.
        Scanner teclado = new Scanner(System.in);

        System.out.println("pon la altura");

        int altura = teclado.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == altura - 1) {
                    System.out.print(" ");
                } else if (i == altura) {
                    if (j != 1 && j != altura)
                        System.out.print("*");
                        else {
                        System.out.print(" ");}
                }else if (j == 1 || j == altura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }


    }

