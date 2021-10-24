package U1.T1;

import java.util.Scanner;
//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
public class ej8_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas;
        int numerodesuspensos = 0; //=numero de suspensos
        int condicionados = 0; //numero de condicionados

        for (int i = 0; i < 6; i++) {
            System.out.println("pon tu nota");
            notas = teclado.nextInt();

            if (notas < 4) {
                numerodesuspensos++;
            }
            if (notas ==4) {
                condicionados ++;
            }
        }
        if (numerodesuspensos==0 && condicionados==0) System.out.println("todo el mundo ha aprobado");
        else System.out.println("hay"+numerodesuspensos+"suspensos y"+condicionados+"condicionados");
    }
}
