import java.util.Random;
public class Tema5Ejercicio8 {
    public static void main(String[] args) {
        Random random = new Random();
        int Array1[] = new int[10];
        int Array2[] = new int[10];
        int Array3[] = new int[10];

        //Rellenamos el array 1
        for(int i = 0; i < Array1.length; i++){
            Array1[i] = random.nextInt(21) - 10;
            System.out.print(Array1[i] + " ");
        }

        System.out.println(" ");

        //Rellenamos el array 2
        for(int i = 0; i < Array1.length; i++){
            Array2[i] = random.nextInt(21) - 10;
            System.out.print(Array2[i] + " ");
        }

        System.out.println(" ");

        for(int i = 0; i < Array3.length; i++){
            Array3[i] = Array1[i] + Array2[i];
            System.out.print(Array3[i] + " ");
        }

    }
}
