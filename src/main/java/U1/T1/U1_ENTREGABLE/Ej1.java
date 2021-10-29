package U1.T1.U1_ENTREGABLE;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
// La anchura y altura de cada una de las letras deberá ser la misma.
// Se solicitará al usuario una altura que deberá siempre impar y mayor que 3.
// En caso de que el usuario no introduzca un valor correcto, se pedirá de nuevo la altura.
        int altura;
        do {
            System.out.println("ponga la altura, debe ser impar y mayor que 3");
            altura = teclado.nextInt();
        }
        while (altura <= 3 || altura % 2 == 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*3; j++) {
                if (j == 0 || j == altura || j==i*3 && i<altura/2 || j == i && i < altura/2 ||
                         j == 9 && i == 0 ||j == (i*9)+1 && i ==j-9) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

                System.out.println();
            }


        }
    }
