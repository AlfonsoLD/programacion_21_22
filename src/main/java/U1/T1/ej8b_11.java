package U1.T1;

import java.util.Scanner;

public class ej8b_11 {
    public static void main(String[] args) {
//Realiza un programa que pinte una X hecha de asteriscos.
//El programa debe pedir la altura.
// Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar error.
        Scanner teclado = new Scanner(System.in);
        System.out.println("pon la altura");
            int altura = teclado.nextInt();

            for (int i =1; i<=altura; i++){
                for (int j=1;j<=altura;j++ ){
                    if(j==altura-i+1 || i==j ) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
    }
}
