package U1.T1;

import java.util.Scanner;

public class ej6_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("operaciones con circunferencias, inserte el radio");
        double radio = teclado.nextDouble();
        System.out.println("¿que quiere hacer?" +
                "1.Calcular diámetro" +
                "2.Calcular perímetro" +
                "3.Calcular área");
        int menu = teclado.nextInt();
        switch (menu) {
            case 1 -> {
                double diametro = radio * 2;
                System.out.println("su diametro es" +diametro);
            }
            case 2 -> {
                double perimetro = 2 * Math.PI * radio;
                System.out.println("su perímetro es" +perimetro);
            }
            case 3 -> {
                double area = Math.PI * radio * radio;
                System.out.println("su área es" +area);
            }
        }
    }
}
