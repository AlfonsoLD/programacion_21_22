package U1.T1;

import java.util.Scanner;

public class ej5_2_21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes condiciones:

        double sueldo = 0;

        System.out.println("1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");
        int cargo = teclado.nextInt();
        switch (cargo) {
            case 1 -> sueldo += 950;
            case 2 -> sueldo += 1200;
            case 3 -> sueldo += 1600;
        }
        System.out.println("¿Cuantos días ha estado de viaje siendo cliente?");
        int dias = teclado.nextInt();
        cargo = dias * 30;

        System.out.println("Introduzca su estado civil (1.soltero, 2.casado");
        int estado = teclado.nextInt();
        double IRPF1 = -0.25;
        double IRPF2 = -0.20;
        if (estado == 1) {
            System.out.println("Su sueldo final es" + cargo + (sueldo * IRPF1));

        }else if (estado == 2) {
            System.out.println("Su sueldo final es" + cargo +(sueldo * IRPF2));
        }
    }
}
