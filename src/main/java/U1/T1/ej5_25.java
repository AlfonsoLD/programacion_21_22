package U1.T1;

import java.util.Scanner;

public class ej5_25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio = 0;
        System.out.println("que ha tomado de comer?");
        String comida = teclado.nextLine();
        switch (comida){
            case "palmera" -> precio +=1.40;
            case "donut" -> precio +=1;
            case "pitufo" -> {
                System.out.println("con aceite o con tortilla");
                String pitufo = teclado.nextLine();
                if (pitufo.equals("aceite")) { precio +=1.20;}
                    else if (pitufo.equals("tortilla")) {precio +=1.60;}
                    else {
                    System.out.println("error");
                    System.out.println("con aceite o con tortilla");
                    pitufo = teclado.nextLine();
                    if (pitufo.equals("aceite")) {
                        precio += 1.20;
                    } else if (pitufo.equals("tortilla")) {
                        precio += 1.60;
                    }
                }
            }
        }
        System.out.println("que ha bebido?");
        String bebida = teclado.nextLine();
        if (bebida.equals("zumo")) {
            precio += 1.50;
        }
        else if (bebida.equals("café")) {
            precio += 1.20;
        }
        System.out.println("el total del desayuno es:" +precio);
    }
}
