package U1.T1;

import java.util.Scanner;
//EL ÁRBOL MÁS ALTO
public class ej8_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pulsa cualquier número para empezar el bucle y luego introduce las alturas, termina introduciendo -1");
        int arboles = teclado.nextInt();
        int cuentaarboles = -1;
        int alto = 0;
        while (arboles != -1) {
            arboles = teclado.nextInt();
            cuentaarboles++;
            if (arboles > alto) {
                alto = arboles;
            }
            System.out.println(cuentaarboles+"- "+arboles);
        }
        System.out.println("el árbol más alto es el" +cuentaarboles+"- "+alto);
    }
}