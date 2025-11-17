import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Tema4Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme una letra");
        String letra = sc.nextLine();

        System.out.println("Introduceme un numero");
        int numero = sc.nextInt();

        Triangulo(letra,numero);
    }

    static void Triangulo(String letra, int numero){
        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }
}
