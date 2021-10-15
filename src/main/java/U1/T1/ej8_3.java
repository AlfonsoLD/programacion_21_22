package U1.T1;

import java.util.Scanner;

public class ej8_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = (int) ((Math.random()*1) +101);
        int introducido;
        do {introducido = teclado.nextInt();
            if (introducido > numero) System.out.println("menor");
            else if (introducido < numero) System.out.println("mayor");
        }
        while (numero != introducido);
        System.out.println("!HAS ACERTADO¡");
    }
}
