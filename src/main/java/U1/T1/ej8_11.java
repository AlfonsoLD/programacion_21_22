package U1.T1;
//TABLAS DE MULTIPLICAR DEL 1 AL 10
public class ej8_11 {
    public static void main(String[] args) {
        int numeros;

        for (int i = 1; i < 10; i++){
            System.out.println("TABLA DEL"+i);
            for (numeros = 1; numeros < 10; numeros++) {
             int resultados = numeros * i;
                System.out.println(numeros+"x"+i+"="+resultados);
            }
        }
    }
}
