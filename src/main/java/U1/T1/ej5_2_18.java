package U1.T1;

import java.util.Scanner;

public class ej5_2_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se  mantiene la nota media anterior.
        System.out.println("este programa calcula la nota de un trimestre de programación, a continuación pedirrá las dos notas que has sacado");
        System.out.println("nota del primer examen");
        double nota1 = teclado.nextDouble();
        System.out.println("nota del segundo examen");
        double nota2 = teclado.nextDouble();
        teclado.nextLine();
        if ((nota2 + nota1) / 2 >= 5) {
            System.out.println("tu nota de programación es" + (nota2 + nota1) % 2);
        } else if ((nota2 + nota1) / 2 < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String aptoono = teclado.nextLine();
    if (aptoono.equals ("apto")) {
    System.out.println("tu nota de programación es un 5");
}
    else if (aptoono.equals("no apto")) {
    System.out.println("tu nota de programación es suspenso,"+ (nota2 + nota1) % 2);
        }
    }
}}