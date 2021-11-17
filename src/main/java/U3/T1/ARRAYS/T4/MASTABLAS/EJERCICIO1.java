package U3.T1.ARRAYS.T4.MASTABLAS;
//rellena un array de 100 entre un rando de 0 a 500 y enseña los maximos y los minimos
import java.util.Arrays;
import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*501);
        }
        System.out.println("El array es este:"+ Arrays.toString(vector));
        System.out.println("Quiere destacar el maximo y el minimo? s/n");
        String respuesta = sc.nextLine();
        if (respuesta.equals("s")||respuesta.equals("S")){
            int maximo=0;
            int minimo =500;
            for (int i = 0; i < vector.length; i++) { //Para guardar el maximo y el minimo
                if (vector[i]>maximo){
                    maximo=vector[i];
                }
                else if (vector[i]<minimo){
                    minimo =vector[i];
                }
            }
            for (int i = 0; i < vector.length; i++) {

                if (vector[i]==maximo || vector[i]==minimo){//para poner los asteriscos en el maximo y en el minimo
                    System.out.println("**"+vector[i]+"**");
                }
                else {
                    System.out.print(vector[i]);
                }
            }
        }

    }
}
