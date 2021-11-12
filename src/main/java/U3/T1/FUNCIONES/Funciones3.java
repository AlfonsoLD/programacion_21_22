package U3.T1.FUNCIONES;

import java.util.Scanner;

public class Funciones3 {
    public static void main(String[] args) {

        System.out.println("calculo de área y volumen");

        int radio , altura, tipo;
        Scanner sc = new Scanner(System.in);
        System.out.println("pon el radio");
        radio = sc.nextInt();
        System.out.println("pon la altura");
        altura = sc.nextInt();
        System.out.println("pon el tipo: 1-area y 2-volumen");
        tipo = sc.nextInt();


        calcular(radio, altura, tipo);
    }


    public static void calcular(int radio, int altura, int tipo) {
        if (tipo==1) {
            double a = 2*Math.PI*(radio+altura);
            System.out.println("el área es"+a);
        } else if (tipo ==2){
            double volumen = Math.PI*radio*radio*altura;
            System.out.println("el volumen es"+volumen);
        }else {
            System.out.println("operacion incorrecta");
        }
    }

}
