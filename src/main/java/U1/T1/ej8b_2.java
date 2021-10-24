package U1.T1;

import java.util.Scanner;

public class ej8b_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros que sean
        System.out.println("introduce 1 numero");
        int n = teclado.nextInt();

        for (int i = n; i < n + 5; i++)
            System.out.println(i+" |"+i*i+" |"+i*i*i);
        }
    }
