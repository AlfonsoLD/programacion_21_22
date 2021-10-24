package U1.T1;

import java.util.Scanner;

//Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
// No se tendrán en cuenta los minutos ni los segundos.
// El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
// Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
public class ej8b_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horastranscurridas=0;
        System.out.println("pon un dia de la semana(1 a 7)");
        int dia1 = teclado.nextInt();
        System.out.println("pon la hora");
        int hora1 = teclado.nextInt();
        System.out.println("pon otro dia de la semana ( 1 a 7)");
        int dia2 = teclado.nextInt();
        System.out.println("pon la hora");
        int hora2 = teclado.nextInt();
        for (int i=dia1; i<dia2; i++) {
            horastranscurridas+=24;
        }
        int horasfinal=horastranscurridas +hora1+hora2;
        System.out.println("han transcurrido "+horasfinal+" horas");
    }
}
