package U1.T1.U1_ENTREGABLE;

import java.util.Scanner;

public class Ej4_mañana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String numerocadena;
        String primeraparte="";
        String segundaparte="";

        do {
            System.out.println("introuzca un numero positivo de 5 cifras");
            numerocadena = teclado.nextLine();

        }while (numerocadena.length()%2!=0);

        for (int i =0; i < numerocadena.length()/2; i++) {
            primeraparte+=numerocadena.charAt(i);
        }
        for (int i= numerocadena.length()/2+1; i <numerocadena.length(); i++) {
            segundaparte+=numerocadena.charAt(i);
        }
        int n1 =Integer.parseInt(primeraparte);
        int n2 = Integer.parseInt(segundaparte);

        boolean esPrimo=true;


    }
}
