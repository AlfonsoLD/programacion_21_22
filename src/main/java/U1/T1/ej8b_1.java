package U1.T1;

import java.util.Scanner;
//NUMERO SECRETO + INTENTOS
public class ej8b_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;

        do {
            System.out.print("clave de la caja fuerte: ");
            numeroIntroducido = teclado.nextInt();

            if (numeroIntroducido == 2086) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.println("Número correcto, abriendo caja fuerte.");
        } else {
            System.out.println("has gastado todas las oportunidades.");
        }
    }
}
