package U3.T1;

public class Funciones3 {
    public static void main(String[] args) {



        calcular(5, 7, 1);
        calcular(5,7,2);
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
