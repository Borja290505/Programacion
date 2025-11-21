
import java.util.Random;
import java.util.Arrays;

public class Tema5Ejercicio10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        // Generar números aleatorios entre -10 y 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        // Mostrar el array original
        System.out.println("Array generado:");
        System.out.println(Arrays.toString(array));


        // Mostrar los elementos que NO se repiten
        System.out.println("Elementos que NO se repiten:");
        boolean hayUnicos = false;
        for (int i = 0; i < array.length; i++) {
            boolean repetido = false;

            // Comparar con el anterior
            if (i > 0 && array[i] == array[i - 1]) {
                repetido = true;
            }
            // Comparar con el siguiente
            if (i < array.length - 1 && array[i] == array[i + 1]) {
                repetido = true;
            }

            if (!repetido) {
                System.out.print(array[i] + " ");
                hayUnicos = true;
            }
        }
        if (!hayUnicos) {
            System.out.println("Todos los números se repiten.");
        }
    }
}
