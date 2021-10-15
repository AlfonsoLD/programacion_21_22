package U1.T1;

import java.util.Scanner;

public class ej7_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
int edad = teclado.nextInt();
int nivel_de_estudios = teclado.nextInt();
int ingresos = teclado.nextInt();
boolean jasp;
if (edad<=28 && nivel_de_estudios >=23 && ingresos >28000) {jasp=true;}
else {jasp =false;}
            
        }
    }