package U1.T1.U1_ENTREGABLE;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Escribe un programa que solicite al usuario los siguientes números:
//Un número entero positivo
//Un número entre 0 y 2 (ambos inclusive)
//Una vez introducidos los dos números nos debe construir un número saltando las cifras según indique el segundo número.
    int positivo;
    int salto;

        do {
            System.out.println("pon el primer numero (positivo)");
            positivo = teclado.nextInt();
        }
        while (positivo <0);

        do {
            System.out.println("Introduzca el salto");
            salto = teclado.nextInt();
        }
        while (salto !=0 && salto !=2);
    int resultado = positivo;
    do {
        if (salto == 0) {
            positivo = resultado;
        } else if (salto ==1) {
         positivo = positivo % 10;
        }else if (salto ==2) {
            positivo= positivo%100;
        }
        positivo = positivo / 10;

    }while (positivo!=0);
        resultado = positivo;
        System.out.println("el numero es"+resultado);
    }
}
