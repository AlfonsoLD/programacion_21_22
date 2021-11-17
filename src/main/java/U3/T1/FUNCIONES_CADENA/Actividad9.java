package U3.T1.FUNCIONES_CADENA;



public class Actividad9 {
    public static void main(String[] args) {


        StringBuilder cadena =new StringBuilder("Alabí Alixar");

        System.out.println("El StringBuilder es: "+cadena);
        System.out.println("Capacidad inicial= "+cadena.capacity());
        System.out.println("Longitud inicial = "+cadena.length());

        cadena = new StringBuilder("Chicharrones de Chiclana");
        System.out.println(cadena);

        int numerochicharrones = 5000;
        cadena = new StringBuilder("Hay "+numerochicharrones+" Chicharrones");
        System.out.println(cadena);

        cadena.append(" en Chiclana");
        System.out.println(cadena);




    }
}
