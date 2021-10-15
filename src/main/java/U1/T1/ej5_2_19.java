package U1.T1;

import java.util.Scanner;

public class ej5_2_19 {
    public static void main(String[] args) {
        Scanner teclador = new Scanner(System.in);
        System.out.println("te diré los minutos que faltan para el fin de semana (viernes a las 15:00)");
        System.out.println("pon un dia de la semana (1 es lunes y 7 domingo)");
        int dia = teclador.nextInt();

        System.out.println("pon la hora");
        int hora = teclador.nextInt();

        System.out.println("pon los minutos");
        int minuto = teclador.nextInt();


        int diasrestantes = dia*24*60;
        int horasrestantes = hora*60;

        int minutosrestantes = diasrestantes + horasrestantes + minuto;
        int minutosfindesemana = 5*24*60;
        int loquequedaparaelfinde = minutosrestantes - minutosfindesemana;
        System.out.println("quedan" +loquequedaparaelfinde+"minutos para el finde");

    }
}
