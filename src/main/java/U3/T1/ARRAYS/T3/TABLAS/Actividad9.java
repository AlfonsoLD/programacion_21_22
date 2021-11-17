package U3.T1.ARRAYS.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] combinacion = new int[0];
        int []apuesta = new int[6];

        do{ //para rellenar la combinacion
            int num = (int) (Math.random()*50+1);
            if (!esta(combinacion, num)){
                combinacion = Arrays.copyOf(combinacion,combinacion.length+1); //Para no tener atributos repetidos
                combinacion[combinacion.length-1]=num;
            }
        }while (combinacion.length!=6);


        for (int i = 0; i < apuesta.length; i++) { //para rellenar la apuesta
            System.out.println("introduce un numero para la apuesta");
            apuesta[i]= sc.nextInt();
        }
        //Para saber el numero de aciertos:
        int aciertos = 0;
        for (int i = 0; i < combinacion.length; i++) {
            if (esta(combinacion, apuesta[i])){
                System.out.println();
                aciertos++;
            }


        }
        System.out.println("Has tenido "+aciertos+" aciertos");
    }
    public static boolean esta(int[] v, int num){
        for (int i = 0; i <v.length ; i++) {
            if (v[i]==num){ //si el vector en la i es igual a la apuesta en i, está.
                return true;
            }
        }

        return false;
    }


}
