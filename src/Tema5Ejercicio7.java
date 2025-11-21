import java.util.Random;

public class Tema5Ejercicio7 {
    public static void main(String[] args) {
        Random random = new Random();
        int Array[] = new int[10];
        for(int i = 0; i < Array.length; i++){
            Array[i] = random.nextInt(21) - 10;
            System.out.print(Array[i] + " ");
        }

        System.out.println(" ");

        for(int i = 0; i < Array.length; i++){
            if(Array[i] < 0){
                Array[i] = Array[i] * -1;
            }
            System.out.print(Array[i] + " ");
        }
    }
}
