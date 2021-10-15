package U1.T1;

import java.util.Scanner;

public class ej5_2_20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double basemasiva = 0;
        System.out.println("introduzca la base imponible");
        base = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("introzca el tipo de IVA (general, reducrido o superreducido");
        String IVA = teclado.nextLine();
        switch (IVA) {
            case "general" ->
                basemasiva = base + base * 0.21;

            case "reducido" ->
                basemasiva = base + base * 0.10;

            case "superreducido" ->
                basemasiva = base + base * 0.04;
        }
        System.out.println("introduce el código promocional (nopro, meno5, mitad o 5porc)");
        String CP = teclado.nextLine();
        switch (CP) {
            case "nopro" ->
                System.out.println("El precio final es" + basemasiva);

            case "mitad" ->
                System.out.println("El precio final es" +basemasiva/2);

            case "meno5" ->
                System.out.println("El precio final es" +basemasiva + (-5));

            case "5porc" ->
                System.out.println("El precio final es" +basemasiva +(basemasiva*0.05));
        }
    }
}
