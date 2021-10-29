package U2.T2;

import java.util.Scanner;
//Usando el depurador detecta el error en el siguiente programa.
public class Debug02 {
    public static void main(String[] args) {
        int i,num;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un número");
        num = sc.nextInt();

        System.out.println("Mostrando los diez primeros números posteriores"+num);
        i = num;

        while (i<num+10) {
            System.out.println("Numero posterior" + i);
            i++;
        }

    }
}
