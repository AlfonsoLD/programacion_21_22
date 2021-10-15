package U1.T1;

import java.util.Scanner;

public class ej5_24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("jugador 1: piedra papel o tijeras");
        String jugador1 = teclado.nextLine();
        System.out.println("jugador 2, tu turno");
        String jugador2 = teclado.nextLine();
        if (!( jugador1.equals("piedra") ||  jugador1.equals("papel") || jugador1.equals("tijeras")))
        {
            System.out.println("error");}

        if (jugador1.equals(jugador2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2;
            switch (jugador1) {
                case "piedra":
                    if (jugador2.equals("tijera")) {
                        ganador = 1;
                    }
                    break;
                case "papel":
                    if (jugador2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;
                case "tijera":
                    if (jugador2.equals("papel")) {
                        ganador = 1;
                    }
                    break;
            }
            System.out.println("ha ganado el jugador " + ganador);
        }
    }
}

