package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;

//En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor"
//según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("acierta la contraseña, jugador 1 inserta la contraseña, versión 2.0");
        String contra = sc.nextLine();

        System.out.println("jugador 2 mete la contraseña");
        String adivino = sc.nextLine();

        if (contra.equals(adivino)){
            System.out.println("acertaste");
        }
        else {
            System.out.println("La contraseña tiene: "+ contra.length()+"caracteres");
            System.out.println("La primera letra es"+ contra.charAt(0));
            System.out.println("La última letra es"+ contra.charAt(contra.length()-1));
        }
        while (!contra.equals(adivino)) {
            System.out.println("otro intento");
            adivino = sc.nextLine();
            if (contra.length() < adivino.length()) {
                System.out.println("Es menor");
            } else if (contra.length() > adivino.length()){
                System.out.println("es mayor");

            }
            else if (contra.equals(adivino)){
                System.out.println("acertaste");}
        }

        }
    }
