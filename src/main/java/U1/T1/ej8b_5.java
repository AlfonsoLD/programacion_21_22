package U1.T1;

//Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
import java.util.Scanner;

public class ej8b_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    int numero;
    int positivos=0;
    int negativos=0;
    int cuentanumeros= 0;

   do {
       System.out.println("otro numero");
       numero = teclado.nextInt();
       cuentanumeros ++;
       if (numero < 0) {negativos ++;}
       if (numero > 0) {positivos ++;}
   }
    while (cuentanumeros<10);
        System.out.println("hay"+positivos+"numeros positivos y"+negativos+"numeros negativos");
    }
}
