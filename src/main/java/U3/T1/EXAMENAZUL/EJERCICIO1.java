package U3.T1.EXAMENAZUL;

import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
//el del banco
        Scanner sc = new Scanner(System.in);
        int entidad, sucursal, control, codCuenta;
        String aux="";
        System.out.println("Introduce el numero de cuenta -ERESUNPRIMO");
        String cuenta= sc.nextLine();

        if (cuenta.length()==23) {
            for (int i=0; i<4; i++) {
                aux= aux + cuenta.charAt(i); //se coge los numeros del rango del bucle

            }
            System.out.println("Entidad"+aux);

            aux=""; //se vacía, es aux pa eso

            for (int i=5; i<=8; i++) {
                aux= aux + cuenta.charAt(i);

            }
            System.out.println("Sucursal"+aux);
            aux="";
            for (int i=10; i<12; i++) {
                aux= aux + cuenta.charAt(i);

            }
            System.out.println("Control"+aux);
            aux="";
            for (int i=13; i<23; i++) {
                aux= aux + cuenta.charAt(i);

            }
            System.out.println("Código"+aux);

            //ahora se convierte a numero la cadena

            codCuenta = Integer.parseInt(aux);

            boolean esPrimo = true;

            for (int i = 2; i<codCuenta; i++) {

                if (codCuenta % i == 0) {
                    esPrimo = false;
                    break;
                }

            }
            if (esPrimo) {
                    System.out.println("ES VÁLIDO");
            }else {
                    System.out.println("NO ES VÁLIDO");
            }


        }else {
            System.out.println("numero de cuenta incorrecto");
        }

    }
}
