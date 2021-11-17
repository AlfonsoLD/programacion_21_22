package U3.T1.EXAMENROJO;

import java.util.Scanner;
//que cuentes el numero de palabras en una frase
public class ejerciciodeclase {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

    int palabras=1;
        System.out.println("pon una frase");
        String frase = teclado.nextLine();
    for (int i=0; i < frase.length(); i++) {
        if (frase.charAt(i) == ' '){
            palabras++;
        }

    }
        System.out.println("la frase tiene"+palabras+"palabras");



    }
}
