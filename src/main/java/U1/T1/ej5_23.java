package U1.T1;

import java.util.Scanner;

public class ej5_23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un sabor (manzana, fresa o chocolate)");

        float precio = 0;
        String sabor = teclado.nextLine();
    switch (sabor){
        case "manzana" -> precio +=18;
        case "fresa" -> precio +=16;
        case "chocolate" -> {
            System.out.println("¿negro o blanco?");
            String chocolate = teclado.nextLine();
            if (chocolate.equals("negro")) {
                precio += 14;
            }else if (chocolate.equals("blanco")) {
                precio += 15;
                }
            }
        }
        System.out.println("¿Quiere nata? s/n");
    String nata = teclado.nextLine();
        if (nata.equals("s")) {precio += 2.50;}

        System.out.println("¿Quiere nombre? s/n");
        String nombre = teclado.nextLine();
        if (nombre.equals("s")) {precio += 2.75;}
        System.out.println("su tarta vale" +precio);
    }
}
