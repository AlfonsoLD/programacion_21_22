package U1.T1;

import java.util.Scanner;

public class ej8_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon un numero del 1 al 10");
        int n = teclado.nextInt();
        if (n >10) {
            System.out.println("error, tenías que poner un número del 1 al 10");
        }else for (int i = 1; i <= 10; i++) {
            int resultados = i * n;
            System.out.println(i+"x"+n+"="+resultados);
        }
    }
}

