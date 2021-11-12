package U3.T1.EXAMENAZUL;

import java.util.Scanner;

public class EJERCICIO1_MAÑANA2020 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    String pares = "";
    String impares= "";
        int numero1, numero2;
        System.out.println("introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("introduce el segundo número");
        numero2 = sc.nextInt();


        String c1, c2;
        c1 = Integer.toString(numero1); //se pasa a cadena pa contarla en el bucle
        c2 = Integer.toString(numero2);

        for (int i =0; i<c1.length(); i++) {
            int numero = Integer.parseInt(""+c1.charAt(i));//se pasa a numero pa el if, porque si no no puede dividir
            if (numero%2==0) {
                pares += c1.charAt(i);
            }else { impares+=c2.charAt(i);




            }
        }
        for (int i =0; i<c2.length(); i++) {
            int numero = Integer.parseInt("" + c2.charAt(i)); //se pasa a numero pa el if
            if (numero % 2 == 0) {
                pares += c1.charAt(i);
            } else {
                impares += c2.charAt(i);

            }
        }

        System.out.println("la cadena de pares es"+pares);
        System.out.println("la cadena de impares es"+impares);
    }
}
