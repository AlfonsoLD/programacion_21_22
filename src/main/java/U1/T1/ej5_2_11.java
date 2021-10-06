package U1.T1;

import java.util.Scanner;
//Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
public class ej5_2_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntos = 0;
        System.out.println("esto es un cuestionario de 10 preguntas sobre asignaturas que se imparten en el curso");
        System.out.println("pregunta 1: cuantos segundos tiene una hora");
        int respuestaa = teclado.nextInt();
        if (respuestaa == 3600 ) {
            System.out.println("acierto! segunda pregunta"); puntos ++;
        } else {
            System.out.println("no! segunda pregunta");
        }
        System.out.println("pregunta 2: cuantos mundiales tiene fernando alonso");
        int respuestab = teclado.nextInt();
        if (respuestab == 2 ) {
            System.out.println("acierto! tercera pregunta"); puntos ++;
        } else {
            System.out.println("no! por dios tercera pregunta");
        }
        System.out.println("pregunta 3: cuantas ligas tiene el betis");
        int respuestac = teclado.nextInt();
        if (respuestac == 1 ) {
            System.out.println("acierto! no se ni como pasó eso, cuarta pregunta"); puntos ++;
        } else {
            System.out.println("no! yo también habría dicho eso, cuarta pregunta");
        }
        System.out.println("pregunta 4: plata1 plomo2");
        int respuestad = teclado.nextInt();
        if (respuestad == 2 ) {
            System.out.println("acierto! quinta pregunta"); puntos ++;
        } else {
            System.out.println("siempre es plomo! quinta pregunta");
        }
        System.out.println("pregunta 5: cuantas piernas tiene una persona");
        int respuestae = teclado.nextInt();
        if (respuestae == 2 ) {
            System.out.println("acierto! sexto pregunta"); puntos ++;
        } else {
            System.out.println("no! y encima eres un flipao");
        }
        System.out.println("ya no hay mas preguntas sé que eran 10, enhorabuena has obtenido" +puntos +"puntos");
    }
}
