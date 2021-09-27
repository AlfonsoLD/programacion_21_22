package U1.T1;

import java.time.LocalDateTime;
public class ej4_5 {
    public static void main(String[] args) {
        LocalDateTime locaDate = LocalDateTime.now();
        int hours = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora actual : "+hours +":"+minutes+":"+seconds);
    }
}
