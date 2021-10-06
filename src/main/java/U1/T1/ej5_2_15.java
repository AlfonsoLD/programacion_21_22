package U1.T1;

import java.util.Scanner;

public class ej5_2_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        int puntos = 0;

        System.out.println("con este programa averiguarás si tu pareja te es infiel, suerte si estas aqui es por algo");
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.println("escribe v o f en cada pregunta");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
}
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti\n");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n");
        respuesta = teclado.nextLine();
        if (respuesta.equals("v")) {
            puntos +=3;
        }
        if (puntos <=10) {
            System.out.println("no es infiel enhorabuena");
        }else if (puntos >=11 && puntos <=22) {
            System.out.println("un poco infiel si que es pero vaya puedes hacer como que no sabes na");
        } else if (puntos >=23) {
            System.out.println("yo la dejaba porque es infiel 100%");
        }

        //Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A continuación se listan las preguntas del test.
    }
}
