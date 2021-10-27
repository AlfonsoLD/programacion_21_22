package U3.T1;

public class Funciones2 {
    public static void main(String[] args) {
//Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

        mostrar(2,8);


    }
    public static void mostrar (int a, int b) {
        int aux;

        if (b<a) {
            aux=b;
            b=a;
            a=aux;
        }
        for (int i=a; i<=b; i++) {
            System.out.println(i);
        }
    }
}
