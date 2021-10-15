package U1.T1;

import java.util.Scanner;

public class ej5_2_22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio = 0;
        System.out.println("elija las dimensiones de su bandera(altura en cm)");
    int altura = teclado.nextInt();
        System.out.println("ahora introduzca la anchura");
        int anchura = teclado.nextInt();

        int dimension = anchura*altura;
        teclado.nextLine();
        System.out.println("quiere un escudo bordado? s/n");
    String siono = teclado.nextLine();
    if (siono.equals("s")) {
        precio += 2.50;
    }
        System.out.println("los gastos de envío son 3,25");
    precio += 3.25;

    double valorfinal = (dimension/100) + precio;

        System.out.println("el precio de su bandera es" +valorfinal+ "euros");
    }
}
