package U3.T1;

import java.util.Scanner;

//Realizar una función que calcule a elevado a n, donde a es real,
// y n entero no negativo. Realizar una versión iterativa y otra recursiva.
public class Funciones11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon un número");
            Double a = sc.nextDouble();
        System.out.println("numero a lo que se eleva");
            int n = sc.nextInt();

        System.out.println(elevado(a,n));
        System.out.println(elevadorecursiva(a,n));

    }
    public static double elevado (Double a, int n){
        Double resultado=a;
        for (int i= 1; i<n;i++){
          resultado*=a;
        }
       return resultado;
    }
    public static double elevadorecursiva (Double a, int n){
        if(n==0) {
       return 1;
        }
        else {
        return a*elevado(a,n-1);
        }
    }
}
