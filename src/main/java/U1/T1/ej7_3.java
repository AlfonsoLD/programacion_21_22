package U1.T1;

public class ej7_3 {
    public static void main(String[] args) {
        System.out.println("te voy a generar una letra aleatoria");
        int numero = (int) ((Math.random()*25)+97);
        char letra = (char) numero;
        System.out.println(letra);
        }
    }
