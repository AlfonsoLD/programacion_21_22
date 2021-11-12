package U3.T1.FUNCIONES;
//Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
public class Funciones12 {
    public static void main(String[] args) {

        System.out.println(factorial(3));
        System.out.println(factorialrecursivo(3));

    }

    public static int factorial (int a) {
        if (a==0){
            return 1;
        }else {

            int resultado = a;
            for (int i = a; i > 0; i--) {
                resultado *= i;
            }
            return resultado;
        }
    }
    public static int factorialrecursivo (int a) {
        if (a==0){
            return 1;
        }
        else {
            return a*factorialrecursivo(a-1);
        }

    }
}
