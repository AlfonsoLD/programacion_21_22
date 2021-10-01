package U1.T1;

import java.util.Scanner;

public class ej5_2_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //ecuacion a(x*x) + bx +c= 0
        System.out.println("ponga el valor de a");
        double a = teclado.nextDouble();
        System.out.println("ponga el valor de b");
        double b = teclado.nextDouble();
        System.out.println("ponga el valor de c");
        double c = teclado.nextDouble();
        double lodearriba = (-b +Math.sqrt((b*b)-4*a*c));
        double lodearriba2 = (b +Math.sqrt((b*b)-4*a*c));
        double lodeabajo = 2*a;  //(-b + √((b*b)-4* a * c))%(2*a)
        double x1 = lodearriba%lodeabajo;
        double x2 = lodearriba2%lodeabajo;
        System.out.println("x1 es igual a" +x1);
        System.out.println("x2 es igual a" +x2);
    }
}
