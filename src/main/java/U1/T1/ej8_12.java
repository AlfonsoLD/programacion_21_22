package U1.T1;

import java.util.Scanner;

public class ej8_12 {
    public static void main(String[] args) {
// El programa debe decir, al final, si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
        Scanner teclado = new Scanner(System.in);
        int notas;

        int numerodenotas = 0; //=numero de suspensos
        for (int i = 0; i < 5; i++) {
            System.out.println("pon tu nota");
            notas = teclado.nextInt();

            if (notas < 5) {
                numerodenotas++;
            }
        }
        if (numerodenotas==0) System.out.println("todo el mundo ha aprobado");
        else System.out.println("hay"+numerodenotas+"suspensos");
    }
}