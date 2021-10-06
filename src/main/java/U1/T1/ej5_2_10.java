package U1.T1;

public class ej5_2_10 {
    public static void main(String[] args) {
        int hora = java.time.LocalDateTime.now().getHour();
        int minutos = java.time.LocalDateTime.now().getMinute();

        int segundosTranscurridos = (hora * 3600) + (minutos * 60);
        int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
        System.out.println("faltan" +segundosHastaMedianoche+"segundos hasta media noche");
    }

}

