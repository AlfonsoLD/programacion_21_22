package U1.T1;

import java.util.Scanner;

public class ej6_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dame el numero del mes y te diré en que mes estamos");
int mes = teclado.nextInt();
switch (mes) {
    case 1: {
        System.out.println("estamos en enero");
    }
    break;
    case 2: {
        System.out.println("estamos en febrero");
    }
    break;
    case 3: {
        System.out.println("estamos en marzo");
    }
    break;
    case 4: {
        System.out.println("estamos en abril");
    }
    break;
    case 5: {
        System.out.println("estamos en mayo");
    }
    break;
    case 6: {
        System.out.println("estamos en junio");
    }
    break;
    case 7: {
        System.out.println("estamos en julio");
    }
    break;
    case 8: {
        System.out.println("estamos en agosto");
    }
    break;
    case 9: {
        System.out.println("estamos en septiembre");
    }
    break;
    case 10: {
        System.out.println("estamos en octubre");
    }
    break;
    case 11: {
        System.out.println("estamos en noviembre");
    }
    break;
    case 12: {
        System.out.println("estamos en diciembre");
    }
    break;
}
    }
}
