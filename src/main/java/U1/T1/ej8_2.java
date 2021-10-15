package U1.T1;

import java.util.Scanner;

public class ej8_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int edad = 0;
    int alumno;
    int numero = 0;
    int mayor = 0;
        do {
            System.out.println("ponga la edad del alumno");
            alumno = teclado.nextInt();
            edad += alumno;
            numero ++;
            if (alumno >= 18) {mayor++;}
        }
    while (alumno >0);
        System.out.println("la media de la edad de los alumnos es"+(edad - alumno)/(numero -1));
        System.out.println("la suma de alumnos es" +numero);
        System.out.println("los alumnos mayores de 18 son" +mayor);
    }
}
