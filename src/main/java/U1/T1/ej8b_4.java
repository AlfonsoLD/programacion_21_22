package U1.T1;

public class ej8b_4 {
    public static void main(String[] args) {
        int altura = 5;
        String character = "*";

        for (int i =0; i< altura; i++) {
            for(int j = 0; j < altura - i -1; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j < (i*2)-1; j++) {
                System.out.println(character);
            }
            System.out.println();
        }
    }
}
