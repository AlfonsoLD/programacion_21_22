package U1.T1;
import java.util.Scanner;

public class ej5_2_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //horoscopo mes y dia
        System.out.println("dia de nacimiento");
        int dia = teclado.nextInt();
        System.out.println("mes de nacimiento");
        int mes = teclado.nextInt();
        if (dia >=21 && mes==3 || dia <=20 && mes==4 ) {
            System.out.println("eres Aries");
        }else if (dia >=21 && mes==4 || dia <=20 && mes==5 ) {
            System.out.println("eres Tauro");
        }else if (dia >=21 && mes==5 || dia <=20 && mes==6 ) {
            System.out.println("eres Géminis");
        }else if (dia >=22 && mes==6 || dia <=22 && mes==7 ) {
            System.out.println("eres Cancer");
        }else if (dia >=22 && mes==7 || dia <=22 && mes==8 ) {
            System.out.println("eres Leo");
        }else if (dia >=23 && mes==8 || dia <=22 && mes==9 ) {
            System.out.println("eres Virgo");
        }else if (dia >=23 && mes==9 || dia <=22 && mes==10 ) {
            System.out.println("eres Libra");
        }else if (dia >=23 && mes==10 || dia <=22 && mes==11 ) {
            System.out.println("eres Escorpio");
        }else if (dia >=23 && mes==11 || dia <=21 && mes==12 ) {
            System.out.println("eres Sagitario");
        }else if (dia >=22 && mes==12 || dia <=20 && mes==1 ) {
            System.out.println("eres Capricornio");
        }else if (dia >=21 && mes==1 || dia <=18 && mes==2 ) {
            System.out.println("eres Aquarius");
        }else if (dia >=19 && mes==2 || dia <=20 && mes==3 ) {
            System.out.println("eres Piscis");
        }

    }
}
