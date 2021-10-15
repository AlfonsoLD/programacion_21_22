package U1.T1;

import java.util.Scanner;

public class ej8_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int numero;
do {
    System.out.println("pon un numero");
    numero = teclado.nextInt();
    if (numero % 2 == 0) {
        System.out.println("es par");
    } else if (numero > 0) {
        System.out.println("es positivo");
    }
    System.out.println("su cuadrado es" + numero * numero);
}
while (numero != 0);
    }
}
