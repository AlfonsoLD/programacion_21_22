package U1.T1;

import java.util.Scanner;

public class ej5_2_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero del 1 al 5 (1 es lunes y 5 viernes)");
        int asignatura = teclado.nextInt();
        switch (asignatura) {
            case 1 -> System.out.println("el lunes toca mates");
            case 2 -> System.out.println("el martes toca lengua");
            case 3 -> System.out.println("el miércoles toca geografía");
            case 4 -> System.out.println("el jueves toca inglés");
            case 5 -> System.out.println("el viernes toca física");
        }
    }
}
