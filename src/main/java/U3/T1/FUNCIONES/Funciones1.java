package U3.T1.FUNCIONES;

import java.util.Scanner;

//Diseñar una función eco() a la que se le pasa como parámetro un número n,
// y muestra por pantalla n veces el mensaje "Eco..."
public class Funciones1 {
    public static void main(String[] args) {

        System.out.println("pon un numero");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
            funcion(n);





    }

    static void funcion(int n) {
        for (int i=1; i<=n; i++) {
            System.out.println("Eco...");
        }
    }

}
