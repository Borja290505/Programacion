import java.sql.Array;
import java.util.Random;
public class Tema5Ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();
        int Array[] = new int[10];
        int numeroNegativos = 0;
        for(int i = 0; i < Array.length; i++){
            Array[i] = random.nextInt(21) - 10;
            if(Array[i] < 0){
                numeroNegativos += 1;
            }
            System.out.print(Array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Hay " + numeroNegativos + " numeros negativos en el array");
    }
}
