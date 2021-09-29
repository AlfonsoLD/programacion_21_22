package U1.T1;

import java.util.Scanner;

public class ej5_2_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero del 1 al 5 (1 es lunes y 7 domingo)");
        int dia = teclado.nextInt();
        switch (dia) {
            case 1 -> System.out.println("es lunes");
            case 2 -> System.out.println("es martes");
            case 3 -> System.out.println("es miércoles");
            case 4 -> System.out.println("es jueves");
            case 5 -> System.out.println("es viernes");
            case 6 -> System.out.println("es sábado");
            case 7 -> System.out.println("es domingo");
        }
    }

}
