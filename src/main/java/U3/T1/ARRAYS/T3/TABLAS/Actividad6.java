package U3.T1.ARRAYS.T3.TABLAS;
//Sacar numeros repetidos de un array con funciones
import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] numeros = {3, 5, 6, 2, 4, 23, 11, 3, 6};

    int[]resultado = sinRepetidos(numeros);

        System.out.println(Arrays.toString(sinRepetidos(numeros)));

    }
    public static int[] sinRepetidos(int[] vector){
         int[] result = new int[0];

        for (int i = 0; i < vector.length; i++) {
            if(!esta(result, vector[i])){
               result = Arrays.copyOf(result, result.length+1);
               result[result.length-1] = vector[i];

            }

        }

    return result;
    }
    public static boolean esta(int[] vector, int elemento){
        for (int i = 0; i < vector.length; i++) {
            if ( vector[i]==elemento){
                return true;
            }

        }
        return false;
    }


}
