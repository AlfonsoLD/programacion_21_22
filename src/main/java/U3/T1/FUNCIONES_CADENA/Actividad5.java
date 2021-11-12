package U3.T1.FUNCIONES_CADENA;

import java.util.Scanner;

//Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal del nombre.
// Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz".
// Sólo se eliminarán las vocales (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican.
public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String resultado = "";
        System.out.println("Nombre completo");
            String nombre = sc.nextLine();

    for (int i=0; i<nombre.length(); i++){

        if (nombre.charAt(i) != 'A' && nombre.charAt(i) != 'E' && nombre.charAt(i) != 'I' &&nombre.charAt(i) != '0'&&
        nombre.charAt(i) != 'U' && nombre.charAt(i) != 'a'&& nombre.charAt(i) != 'e'&& nombre.charAt(i) != 'i'&&
                nombre.charAt(i) != 'o'&& nombre.charAt(i) != 'u'){
            resultado=resultado+nombre.charAt(i);
        }
    }
        System.out.println(resultado);

    }
}
