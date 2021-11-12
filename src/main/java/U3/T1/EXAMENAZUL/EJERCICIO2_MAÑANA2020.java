package U3.T1.EXAMENAZUL;

import java.util.Scanner;

public class EJERCICIO2_MAÑANA2020 {
    public static void main(String[] args) {
//Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares por un lado, y los impares por otro. Los dígitos
//se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int  donde sea necesario para admitir números largos.
//Ejemplo 1:
// Por favor, introduzca un número entero positivo: 94026782
// Dígitos pares: 4 0 2 6 8 2
// Dígitos impares: 9 7
// Suma de los dígitos pares: 22
// Suma de los dígitos impares: 16
        Scanner sc = new Scanner(System.in);


        int num;
        int sumapares =0;
        int sumaimpares =0;
        String pares ="";
        String impares ="";

        System.out.println("introduzca un numero pls");
        num = sc.nextInt();

        String cadena;
        cadena = Integer.toString(num);

        for (int i =0; i<=cadena.length(); i++) {
            int numero = Integer.parseInt(""+cadena.charAt(i));

            if (numero%2==0) {
                sumapares++;
                pares+=cadena.charAt(i);

            }else {
                sumaimpares++;
                impares+=cadena.charAt(i);
            }
        }
        System.out.println("Número de dígitos impares"+sumaimpares);
        System.out.println("Número de dígitos pares"+sumapares);
        System.out.println("Impares: "+impares);
        System.out.println("Pares: "+pares);

    }
}

