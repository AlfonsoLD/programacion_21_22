package U1.T1;

import java.util.Scanner;
// NUMERO CAPICÚO
public class EJERCICIO2CLASE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long num = teclado.nextLong();
        long cociente = num;
        long resto = 0;
        long rev = 0;
        while (cociente > 0) {
            resto = cociente % 10;
            cociente = cociente / 10;
            rev = (rev + resto) * 10;
            System.out.println("cociente" + cociente + "resto" + resto);
        }
        rev = rev / 10;
        System.out.println("cociente" + cociente + "rev" + resto + "rev" + rev);

        if (num == rev) {
            System.out.println("el numero es capicúo");
        } else {
            System.out.println("el número no es capicúo");

        }
    }
}