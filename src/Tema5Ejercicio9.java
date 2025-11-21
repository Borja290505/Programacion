import java.util.Random;
public class Tema5Ejercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int Array[] = new int[10];

        for(int i = 0; i < Array.length; i++){
            Array[i] = random.nextInt(21) - 10;
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Números que se repiten:");
        boolean hayRepetidos = false;
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] == Array[i - 1]) {
                System.out.print(Array[i] + " ");
                hayRepetidos = true;
            }
        }

        if (!hayRepetidos) {
            System.out.println("No hay números repetidos.");
        }


    }

}
