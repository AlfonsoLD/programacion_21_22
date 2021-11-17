package U3.T1.ARRAYS.T3.TABLAS;
//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
//Cada clase está compuesta por 5 alumnos.
//Se pide leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero.
//Debemos mostrar, al final, la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición pos
//(que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por trimestre-,
//o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los alumnos).
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]nota1 = new int [5];
        int[]nota2 = new int [5];
        int[]nota3 = new int [5];
        int suma = 0;
        for (int i = 0; i < nota1.length; i++) {
            System.out.println("Alumno nº" + (i + 1) + " pon tu nota");
            nota1[i] = sc.nextInt();
            suma+=nota1[i];

        }
        System.out.println("la media del trimestre 1 es: "+((double)suma/5));
        suma = 0;
        for (int i = 0; i < nota2.length; i++) {
            System.out.println("Alumno nº" + (i + 1) + " pon tu nota");
            nota2[i] = sc.nextInt();
            suma+=nota2[i];

        }
        System.out.println("la media del trimestre 2 es: "+((double)suma/5));
        suma=0;
        for (int i = 0; i < nota3.length; i++) {
            System.out.println("Alumno nº" + (i + 1) + " pon tu nota");
            nota3[i] = sc.nextInt();
            suma+=nota3[i];

        }
        System.out.println("la media del trimestre 3 es: "+((double)suma/5));

        System.out.println("introduvr la posicion del alumno");
        int pos = sc.nextInt();

        System.out.println("la media del alumno es"
        +((double)nota1[pos]+nota2[pos]+nota3[pos]/3));
    }
}
