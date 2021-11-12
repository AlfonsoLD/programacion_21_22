package U3.T1.ARRAYS;
// pregunte qué número quiere buscar y le contestará si ese número forma parte de los 10 iniciales o no.
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = new int [10];
        for (int i = 0; i< lista.length; i++){
            System.out.println("pon un numero");
            lista[i] = sc.nextInt();
        }
        int numero;
        System.out.println("que numero quiere buscar?");
       do{
           numero = sc.nextInt(); //esto se puede hacer con un booleano y en un for
            if (numero == lista[0] || numero == lista[1] ||numero == lista[2]
           ||numero == lista[3] || numero == lista[4] ||numero == lista[5]
           ||numero == lista[6] || numero == lista[7] ||numero == lista[8]
           ||numero == lista[9]){
                System.out.println("Está en la lista");
            }
            else {
                System.out.println("No está en la lista");
            }
        } while (numero!=-1);

    }
}
