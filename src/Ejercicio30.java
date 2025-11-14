import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introducimos la altura del triangulo
        System.out.print("Introduce la altura del triángulo: ");
        int altura = scanner.nextInt();

        //Dibujamos el triangulo
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}