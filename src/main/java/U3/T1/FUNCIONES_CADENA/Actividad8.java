package U3.T1.FUNCIONES_CADENA;
//Idioma javalandia
import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce la frase");

        String frase = sc.nextLine();
        String traduccion = "";
        if (frase.substring(0,16).equals("Javalín, javalón") && frase.length()>17){

            traduccion = frase.substring(16,frase.length()); //este coge un trozo de la cadena
            System.out.println("el dialecto es Javalín, javalón");

            System.out.println(traduccion.trim()); //Esta funcion le quita los espacios por delante y por detras

        }
        else {
            System.out.println("NO ESTÁ EN JAVALINÉS");
        }
    }
}
